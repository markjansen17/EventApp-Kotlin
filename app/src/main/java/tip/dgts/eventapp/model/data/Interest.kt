package tip.dgts.eventapp.model.data

import com.google.gson.annotations.SerializedName

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Interest(@PrimaryKey
                    var id: Int = 0,
                    var title: String = ""
) : RealmObject()
