package yodgorbekkomilov.edgar.printfultask.ui.repo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import yodgorbekkomilov.edgar.printfultask.ui.TcpClient

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {
    @Provides
    fun provideTCPClient(): TcpClient {
        return TcpClient()
    }
}