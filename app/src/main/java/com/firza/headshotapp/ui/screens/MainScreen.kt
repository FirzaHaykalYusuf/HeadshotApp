import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.firza.headshotapp.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Galery Headshot App",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Scaffold(
            floatingActionButton = {
                FabIconWithDrawable {
                    // Aksi navigasi ke CameraScreen
                    navController.navigate("camera")
                }
            },
            floatingActionButtonPosition = FabPosition.Center,
            modifier = Modifier.fillMaxSize()
        ) {

            // Menggunakan LazyVerticalGrid untuk menampilkan data dalam 2 kolom
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(8.dp),
                modifier = Modifier.fillMaxWidth(), // Memastikan grid mengisi lebar maksimum
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(getUsers()) { user ->
                    HeadshotCard(name = user.name, drawableId = user.drawableId)
                }
            }
        }
    }
}

@Composable
fun FabIconWithDrawable(onClick: () -> Unit) {
    FloatingActionButton(
        onClick = onClick,
        modifier = Modifier
            .clip(CircleShape)
            .border(BorderStroke(1.dp, Color.Transparent))
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_add_photo),
            contentDescription = "Open Camera",
            modifier = Modifier
                .size(80.dp)
                .padding(10.dp)
        )
    }
}


// Fungsi untuk mendapatkan daftar pengguna, ini harus diganti dengan data dinamis dari database
fun getUsers(): List<User> {
    return listOf(
        User("Agus", R.drawable.firza),
        User("Marissa", R.drawable.firza),
        User("Yani", R.drawable.firza),
        User("Bang Ucok", R.drawable.firza),
        User("Baba Yaga", R.drawable.ic_change_camera),
        User("Baba YO", R.drawable.ic_change_camera),
        User("Baba UBAYA", R.drawable.ic_change_camera)
        // Tambahkan pengguna lain jika perlu
    )
}

data class User(val name: String, val drawableId: Int)

@Composable
fun HeadshotCard(name: String, drawableId: Int) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .aspectRatio(3f / 4f),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center, // Memusatkan konten di dalam Box
            modifier = Modifier
                .fillMaxSize() // Box akan memenuhi seluruh area Card
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally, // Memusatkan konten secara horizontal
                verticalArrangement = Arrangement.Center, // Memusatkan konten secara vertikal
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = drawableId),
                    contentDescription = name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
//                        .size(100.dp) // Ukuran gambar
                        .fillMaxWidth(fraction = 5f)
                        .aspectRatio(1f) // Membuat gambar tetap berbentuk lingkaran
                        .clip(RoundedCornerShape(10.dp)) // Memotong gambar menjadi lingkaran
                        .border(
                            1.2.dp,
                            Color.Gray,
                            RoundedCornerShape(10.dp)
                        ) // Border di sekitar gambar
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spasi antara gambar dan teks
                Text(
                    text = name,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxSize(),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}