package desktop.hambug.network

import desktop.hambug.model.Franchise
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface HambugApi {
    @GET("data.json")
    suspend fun getAllFranchise(): Franchise
}