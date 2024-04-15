class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var maps = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val strOrdered = str.toCharArray().sorted().joinToString("")
            val value = maps.getOrDefault(strOrdered, mutableListOf())
            value.add(str)
            maps[strOrdered] = value
        }

        println(maps)

        return ArrayList(maps.values)
    }
}