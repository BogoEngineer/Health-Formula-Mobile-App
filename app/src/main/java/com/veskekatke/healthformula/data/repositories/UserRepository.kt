package com.veskekatke.healthformula.data.repositories

import com.veskekatke.healthformula.data.datasources.ServerAuthenticateResponse
import com.veskekatke.healthformula.data.datasources.ServerChangePasswordResponse
import com.veskekatke.healthformula.data.datasources.ServerResponse
import com.veskekatke.healthformula.data.datasources.ServerUserResponse
import com.veskekatke.healthformula.data.models.resource.Resource
import com.veskekatke.healthformula.data.models.user.Credentials
import com.veskekatke.healthformula.data.models.user.PasswordInformation
import com.veskekatke.healthformula.data.models.user.UserResponse
import io.reactivex.Observable
import io.reactivex.Single

interface UserRepository {
    fun fetch(userId: String): Single<ServerUserResponse<UserResponse>>
    fun authenticate(credentials: Credentials): Single<ServerAuthenticateResponse>
    fun get(): UserResponse
    fun changePassword(passInfo: PasswordInformation): Single<ServerChangePasswordResponse>
    fun resetPassword(email: String): Single<ServerUserResponse<UserResponse>>
    //fun getFoodItemsByName(name: String)
}