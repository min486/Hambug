package desktop.hambug.ui.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import desktop.hambug.repository.HambugRepository
import desktop.hambug.repository.MainRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MainRepository,
    private val hambugRepo: HambugRepository
) : ViewModel() {

    init {
        getData()
    }

    private fun getData() {
        viewModelScope.launch {
            try {
                val response = hambugRepo.getFranchise()
                Log.d("MainViewModel", "데이터 수신 성공 : ${response.franchise}")
            } catch (e: Exception) {
                Log.d("MainViewModel", "데이터 수신 실패 : ${e.message}")
            }
        }
    }

    val message: String = repository.getMessage()
}