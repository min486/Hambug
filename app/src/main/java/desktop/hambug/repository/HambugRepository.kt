package desktop.hambug.repository

import desktop.hambug.model.Franchise
import desktop.hambug.network.HambugApi
import javax.inject.Inject

class HambugRepository @Inject constructor(
    private val api: HambugApi
) {
    suspend fun getFranchise(): Franchise {
        return api.getAllFranchise()
    }
}