package pic.poc.learningtime

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NativeGreeting {
    private val scope: CoroutineScope = MainScope(Dispatchers.Main)

    fun onGreeting(render: (String) -> Unit) {
        scope.launch { render(Greeting().greeting()) }
    }
}
