package elkqueryservice

interface ELKQueryService {
    val user: String
    val password: String
    fun get_index_fields (index: String): String
}