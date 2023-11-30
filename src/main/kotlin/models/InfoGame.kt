package models

data class InfoGame(val info:InfoCheapSharkApi) {
    override fun toString(): String {
        return info.toString()
    }
}