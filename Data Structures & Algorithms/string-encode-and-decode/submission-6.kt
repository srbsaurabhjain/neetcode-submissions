class Solution {

    val sep = "||" 
    fun encode(strs: List<String>): String {
        //val lstSize = strs.size();
        //if(strs.size==0){
            //println("size 0")
          //  return "_"
        // }
        val result = strs.joinToString(separator=sep)
        return strs.size.toString()+sep+result
    }

    fun decode(str: String): List<String> {
        //println(str)
        //if(str=="_"){
          //  println(str+"emptylist")
            //return emptyList<String>()
        // }
        val result = str.split(sep)
        //println(result)
        if(result[0]== "0"){
            return emptyList<String>()
        } else {
        val newR = result.drop(1)
            return newR
         }
    }
}
