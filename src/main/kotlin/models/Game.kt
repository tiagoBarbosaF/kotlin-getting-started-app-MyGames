package models

data class Game(val title:String, val cover:String) {
    var description: String = ""

    override fun toString(): String {
        return "Game:\n" +
                "title='$title'\n" +
                "cover='$cover'\n" +
                "description='$description'"
    }


}