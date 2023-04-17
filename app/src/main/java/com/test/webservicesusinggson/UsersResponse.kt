package com.test.webservicesusinggson

import com.google.gson.annotations.SerializedName

data class UsersResponse(
    @SerializedName("page")
    var pageNumber : Int,

    @SerializedName("per_page")
    var usersPerPage : Int,

    @SerializedName("total")
    var totalCount : Int,

    @SerializedName("total_pages")
    var totalPages : Int,

    @SerializedName("data")
    var users :ArrayList<User>

){
    override fun toString(): String {
        return "page -- $pageNumber ----- per_page-- $usersPerPage"
    }
}
