package desktop.hambug.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import desktop.hambug.data.DataOrException
import desktop.hambug.model.FranchiseItem
import desktop.hambug.repository.MainRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MainRepository
) : ViewModel() {

    private val _franchiseState = MutableStateFlow(
        DataOrException<List<FranchiseItem>, Boolean, Exception>(
            data = null,
            loading = true,
            e = null
        )
    )
    val franchiseState: StateFlow<DataOrException<List<FranchiseItem>, Boolean, Exception>> = _franchiseState

    init {
        getData()
    }

    private fun getData() {
        viewModelScope.launch {
            val response = repository.getAllFranchise()
            _franchiseState.value = response
        }
    }
}