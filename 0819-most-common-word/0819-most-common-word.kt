class Solution {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val strs = paragraph.replace("\\W+".toRegex(), "").toLowerCase().split(" ")
        println(strs)
        val maps: MutableMap<String, Int> = mutableMapOf()
        
        for (str in strs) {
            if (!banned.contains(str)) {
                maps[str] = maps.getOrDefault(str, 0) + 1
            }
        }
        println(maps)

        return maps.maxBy { it.value }!!.key
    }
}