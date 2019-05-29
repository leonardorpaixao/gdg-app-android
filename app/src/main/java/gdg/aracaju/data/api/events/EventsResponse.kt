package gdg.aracaju.data.api.events

internal data class EventsResponse(

    val name: String,
    val id_details: Int,
    val date: String,
    val img: String,
    val time: String
) {
    constructor() : this("", 0, "", "", "")
}