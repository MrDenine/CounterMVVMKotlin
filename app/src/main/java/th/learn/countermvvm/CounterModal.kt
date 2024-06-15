package th.learn.countermvvm

data class CounterModal (var count : Int)

class CounterRepository {
    private var counter = CounterModal(0)

    fun getCounter() = counter

    fun incrementCounter(){
        counter.count++
    }

    fun decrementCounter(){
        counter.count--
    }
}