import com.google.gson.Gson
import models.Game
import models.InfoGame
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers

fun main() {
    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder().uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=612")).build()

    val response = client.send(request, BodyHandlers.ofString())
    val jsonResponse = response.body()

    val gson = Gson()

    val cheapSharkGame = gson.fromJson(jsonResponse, InfoGame::class.java)
    println(cheapSharkGame)

    val game = Game(cheapSharkGame.info.title, cheapSharkGame.info.thumb)
    println(game)
}