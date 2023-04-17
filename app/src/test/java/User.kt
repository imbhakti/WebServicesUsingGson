import android.media.Image
import android.provider.ContactsContract.CommonDataKinds.Email

annotation class SerializedName(val value: String)

data class User(
    var id : Int,
    var email: String,
    var avtar :String,
    @SerializedName("first_name")
    var firstName : String,
    @SerializedName("last_name")
    var lastName : String
)
