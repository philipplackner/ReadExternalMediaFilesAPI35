package com.plcoding.readexternalmediafilesapi35

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun MediaListItem(
    file: MediaFile,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        when (file.type) {
            MediaType.IMAGE -> {
                AsyncImage(
                    model = file.uri,
                    contentDescription = null,
                    modifier = Modifier
                        .width(100.dp)
                )
            }

            MediaType.VIDEO -> {
                Image(
                    painter = painterResource(id = R.drawable.video),
                    contentDescription = null,
                    modifier = Modifier.width(100.dp)
                )
            }

            MediaType.AUDIO -> {
                Image(
                    painter = painterResource(id = R.drawable.audio),
                    contentDescription = null,
                    modifier = Modifier.width(100.dp)
                )
            }
        }
        Text(
            text = "${file.name} - ${file.type}",
            modifier = Modifier
                .padding(16.dp)
                .weight(1f)
        )
    }
}