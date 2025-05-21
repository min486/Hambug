package desktop.hambug.repository

import android.util.Log
import desktop.hambug.data.DataOrException
import desktop.hambug.model.FranchiseItem
import desktop.hambug.network.HambugApi
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val api: HambugApi
) {
    suspend fun getAllFranchise(): DataOrException<List<FranchiseItem>, Boolean, Exception> {
        val dataOrException = DataOrException<List<FranchiseItem>, Boolean, Exception>()

        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllFranchise().franchise
            dataOrException.loading = false
        } catch (e: Exception) {
            dataOrException.e = e
            dataOrException.loading = false
            Log.d("repository", "데이터 수신 실패 : ${e.message}")
        }
        return dataOrException
    }
}