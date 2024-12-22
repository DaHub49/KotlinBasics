package za.co.howtogeek.kotlinbasics.day8


import androidx.compose.runtime.State
import androidx.compose.runtime.asIntState
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf

class CounterViewModel: ViewModel(){

    // the "_" prefix indicates that the variable is private
    private var _count = mutableStateOf(0)
    val count: State<Int> = _count.asIntState()
    //val count: State<Int> = _count.asIntState()


    fun increment(){
        _count.value++
    }

    fun decrement(){
        _count.value--
    }
}