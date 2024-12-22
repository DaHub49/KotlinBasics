package za.co.howtogeek.kotlinbasics.day8


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/*
Save checkpoint
 */

class CounterViewModel: ViewModel(){

    // the "_" prefix indicates that the variable is private
    private var _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count
    //val count: State<Int> = _count.asIntState()


    fun increment(){
        _count.value++
    }

    fun decrement(){
        _count.value--
    }
}