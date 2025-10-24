package com.example.projek4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.columnMeasurePolicy
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Activitaspertama(modifier: Modifier){
    Column (modifier= Modifier
        .padding(top=100.dp)
        .fillMaxSize(),
       horizontalAlignment = Alignment .CenterHorizontally
    ){
        Text(
            text = stringResource(id= R.string.prodi),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(Id = R.string.univ),
            fontSize = 18.sp
        )
        Spacer()
