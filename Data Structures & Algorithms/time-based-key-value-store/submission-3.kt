class TimeMap() {

    var timeMap = mutableMapOf<String, MutableMap<Int,String>>()
    //var timeValue = mutableMapOf<Int,String>()
    //var timestamp_prev = 0
    fun set(key: String, value: String, timestamp: Int) {
        if (!timeMap.containsKey(key)) {
            timeMap[key] = mutableMapOf<Int,String>()
        }
        //val time=""+timestamp+"_"+value
        timeMap[key]?.put(timestamp, value)
        println(timeMap)
    }

    fun get(key: String, timestamp: Int): String {
        val valueMap = timeMap.get(key)
        if(valueMap==null){
            return ""
        }
        val value = valueMap?.get(timestamp)
        println(value)
        if(value!=null){
            //timestamp_prev = timestamp
            return value
        }
        println(valueMap.keys)
        val keys = valueMap.keys.toIntArray()
        var low = 0
        var high = keys.size-1
        var timestampPrev=-1
        while(low<=high){
            if((low+1)>high){
                if(timestamp>keys[high]) timestampPrev = keys[high]
                break
            }
            if(keys[low]<timestamp && timestamp<keys[low+1]){
                timestampPrev = keys[low]
                break
            } else{
                low++
            }
        }
        /*
        while(low<=high){
            val mid = (low+high)/2
            if(keys[mid]>timestamp){
                //move left
                high=mid-1
            } else {
                low = mid+1
            }
        }*/
        if(timestampPrev<0){
            return ""
        }
        val preValue = valueMap?.get(timestampPrev)
        if(preValue!=null) {
            return preValue
        } else{
            return ""
        }
    }
}
