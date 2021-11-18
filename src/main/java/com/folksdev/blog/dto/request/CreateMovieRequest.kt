package com.folksdev.blog.dto.request

import javax.validation.constraints.NotBlank

data class CreateMovieRequest(
    @field:NotBlank
    val name : String
)