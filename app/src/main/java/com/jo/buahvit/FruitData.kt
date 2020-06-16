/***
 * Author : Joshua Sinaga
 ***/

package com.jo.buahvit

object FruitData {

    val name = arrayListOf(
        "Apel","Jeruk","Pisang","Anggur","Pir",
        "Stroberi","Rambutan","Salak","Mangga","Sirsak",
        "Kelapa","Duku","Semangka","Markisa","Nanas"
    )

    private val rawColor = arrayListOf(
        "F44336",   // Apel
        "FBC02D",   // Jeruk
        "FFEB3B",   // Pisang
        "AB47BC",   // Anggur
        "FFEB3B",   // Pir
        "EC407A",   // Stroberi
        "F44336",   // Rambutan
        "D84315",   // Salak
        "FFEB3B",   // Mangga
        "76FF03",   // Sirsak
        "64DD17",   // Kelapa
        "FBC02D",   // Duku
        "F44336",   // Semangka
        "AB47BC",   // Markisa
        "FBC02D"    // Nanas
    )

    private val shortDesc = arrayListOf(
        "Buah apel banyak mengandung berbagai macam nutrisi yang baik dan sangat dibutuhkan oleh tubuh kita, " +
                "seperti kandungan Vitamin A, C dan mineralnya yang tinggi",

        "Jeruk menjadi buah favorit di seluruh dunia. " +
                "Rasa asam, kecut, dan manis yang dimilikinya mampu memikat banyak orang",

        "Pisang merupakan salah satu buah yang selalu ada di setiap musim di Indonesia. " +
                "Ada banyak jenis pisang yang bisa di konsumsi secara langsung atau diolah dahulu",

        "Anggur merupakan salah satu buah yang populer di dunia. " +
                "Banyaknya manfaat yang diperoleh dari mengonsumsi buah ini membuat anggur semakin digemari",

        "Pir merupakan buah yang kaya akan kandungan nutrisi seperti protein, serat, serta vitamin C dan K. " +
                "Pir juga mengandung prebiotik yang mampu menjaga kesehatan usus",

        "Stroberi memiliki banyak manfaat bagi kesehatan, termasuk mencegah jerawat, " +
                "risiko diabetes hingga meningkatkan fungsi jantung",

        "Rambutan baik dikonsumsi bagi semua kalangan. Namun, masih ada orang yang enggan mengonsumsi buah rambutan " +
                "karena tidak suka dengan kulitnya yang memiliki rambut",

        "Salak termasuk buah yang mudah didapat sepanjang musim di Indonesia. " +
                "Buah yang biasanya disajikan sebagai makanan pencuci mulut ini mengandung banyak nutrisi",

        "Mangga dikenal sebagai raja buah-buahan. Selain rasanya manis, " +
                "mangga juga mengandung banyak vitamin dan antioksidan yang bermanfaat untuk kesehatan",

        "Buah sirsak banyak ditemukan di daerah beriklim tropis. " +
                "Buah bernama latin Annona muricata ini sangat mudah ditemukan di Indonesia dan umum dijadikan santapan",

        "Indonesia adalah negara dengan garis pantai terpanjang ketiga di dunia. " +
                "Salah satu tanaman yang biasa tumbuh di tepi pantai adalah pohon kelapa",

        "Duku seringkali dijadikan camilan favorit, terutama saat panen tiba. " +
                "Namun, manfaat buah duku untuk kesehatan belum menyamai popularitasnya sebagai kudapan biasa",

        "Semangka adalah salah satu buah yang biasa dijadikan makanan penutup. " +
                "Buah yang satu ini cukup populer dan digemari, mulai anak-anak hingga orang dewasa",

        "Markisa merupakan salah satu buah yang memanfaatkan bijinya untuk dikonsumsi. " +
                "Buah markisa mempunyai ciri khas dengan rasa yang kecut sedikit manis",

        "Nanas adalah buah tropis yang sangat lezat dan sehat. " +
                "Buah nanas dapat memiliki berat hingga delapan kilogram dan memiliki rasa yang manis dan asam."
    )

    private val fullDesc = arrayListOf(
        "Apel adalah salah satu buah yang paling populer di seluruh dunia. Berbagai penelitian setuju bahwa buah apel memiliki banyak manfaat menakjubkan yang baik untuk tubuh. Bahkan, saking banyaknya manfaat buah ini bagi kesehatan, apel diklaim bisa menjauhkan Anda dari berbagai penyakit. Alhasil, Anda jadi tak perlu sering-sering cek kesehatan ke dokter.\n\n " +
                "Pohon apel berasal dari bagian timur Eropa dan barat daya Asia. Setelah beberapa abad kemudian, tanaman apel tersebar ke seluruh dunia, menghasilkan berbagai varian yang mudah ditemukan baik di pasar tradisional maupun di supermarket.\n\n " +
                "Tak selalu merah, buah apel juga ada yang berwarna hijau atau kekuningan. Rasa yang ditawarkan dari buah ini pun berbeda-beda. Ada yang manis seperti madu, ada juga yang sepat walau sudah matang. Apa pun warna dan rasanya, buah apel tetap mengandung nutrisi tinggi yang baik untuk tubuh Anda.\n\n " +
                "Konsumsi apel setiap hari dapat membantu meningkatkan kesehatan Anda karena kandungan serat, vitamin, fitonutrien, serta antioksidan di dalamnya. Kandungan nutrisi di dalam buah apel juga bisa mencegah Anda dari berbagai penyakit, dan tentunya menjauhkan Anda dari keharusan berkunjung ke dokter karena sakit.",

        "Jeruk menjadi buah favorit di seluruh dunia. Rasa asam, kecut, dan manis yang dimilikinya mampu memikat banyak orang. Rasanya yang menarik ini membuat buah jeruk banyak diolah menjadi berbagai macam menu makanan atau minuman.\n\n " +
                "Jeruk memiliki lebih dari 170 fitokimia dan lebih dari 60 flavonoid. Manfaat jeruk ini telah terbukti memiliki sifat anti-inflamasi dan efek antioksidan yang kuat. Manfaat jeruk telah terbukti dari berbagai penelitian ilmiah.\n\n " +
                "Buah jeruk sangat bergizi, menawarkan sejumlah vitamin, mineral, dan senyawa yang membantu Anda tetap sehat. Jeruk adalah sumber serat larut yang baik, yang membantu menurunkan kolesterol dan membantu pencernaan. Jeruk juga rendah kalori, menjadikannya pilihan cerdas bagi orang yang ingin menurunkan atau mempertahankan berat badannya.\n\n " +
                "Jika Anda ingin memenuhi nutrisi harian, buah jeruk menjadi salah satu pilihan tepat. Jeruk biasa dikonsumsi langsung, di jus, atau sebagai campuran makanaan dan minuman.",

        "Pisang merupakan salah satu buah yang selalu ada di setiap musim di Indonesia. Ada sekitar 246 jenis pisang yang bisa kamu konsumsi baik secara langsung maupun mengolahnya menjadi beragam cemilan.\n\n " +
                "Selain rasanya yang enak, pisang juga kaya akan kandungan nutrisi yang baik untuk kesehatan tubuh seperti potassium, karbohidrat, mineral, vitamin C, vitamin B6, kalium, dan magnesium. Pisang juga memiliki banyak khasiat misalnya menurunkan tekanan darah tinggi sampai menangkal radikal bebas.\n\n " +
                "Selain karena manfaat buah pisang yang melimpah, buah pisang juga populer karena buah ini bersifat multiguna artinya banyak berbagai jenis menu makanan menggunakan pisang sebagai bahan dasar utama ataupun pendampingnya.\n\n",

        "Manfaat buah anggur untuk kesehatan sudah tidak perlu diragukan lagi. Buah yang berbentuk bulat kecil ini memiliki rasa manis yang digemari oleh banyak orang. Kamu bisa mendapatkan manfaat buah anggur merah ini baik saat dikonsumsi mentah maupun setelah diolah menjadi jus, jelly, selai anggur, dan bentuk olahan lainnya.\n\n " +
                "Berbagai kandungan nutrisi dalam buah anggur merah menjadi faktor utama manfaatnya untuk kesehatan. Secara umum, kandungan nutrisi anggur terdiri dari 70 persen air dan 20 persen zat gula. 10 persen kandungan gizi lainnya pada anggur berupa asam galat, glukosida, asam folat, mangan, zat besi, sejumlah vitamin, dan kalsium.\n\n " +
                "Selain itu, terdapat pula senyawa antioksidan seperti polifenol dan resveratrol . Kandungan antioksidan polifenol dalam buah anggur merah ini akan memberi tubuh perlindungan dari penyakit dan kerusakan akibat faktor lingkungan, serta membantu melawan radikal bebas.\n\n " +
                "Manfaat buah anggur merah untuk kesehatan dipengaruhi kandungan fitonutrien dan antioksidannya yang tinggi. Rutin mengonsumsi buah ini ternyata tidak hanya baik untuk menjaga kesehatan, namun juga dapat dijadikan sebagai perawatan kecantikan.",

        "Pir merupakan buah yang kaya akan kandungan nutrisi seperti protein, karbohidrat, serat, serta vitamin C dan K. Kandungan kalori yang rendah pada pir juga menjadikan buah ini cocok untuk dikonsumsi saat sedang diet. Pir juga mengandung prebiotik yang mampu menjaga kesehatan usus, meredakan sembelit, dan meningkatkan sistem pencernaan secara keseluruhan.\n\n " +
                "Pir kaya akan flavonoid, yaitu antioksidan yang mampu membantu melawan peradangan dan menurunkan risiko beberapa penyakit seperti diabetes dan kanker. Selain itu beberapa kandungan vitamin dan mineral yang ada pada pir juga disebut dapat membantu memerangi peradangan seperti tembaga, vitamin C, dan vitamin K.\n\n " +
                "Pir mengandung berbagai macam senyawa yang menunjukkan sifat anti-kanker seperti kandungan antosianin dan asam sinamat. Menurut sebuah penelitian yang dipublikasikan pada tahun 2013, kandungan flavonoid pada buah pir juga dapat melawan kanker payudara dan ovarium.",

        "Stroberi memiliki banyak manfaat bagi kesehatan, termasuk mencegah jerawat hingga mengurangi risiko diabetes. Tak hanya lezat, stroberi kaya akan antioksidan dan polyphenic sehingga memiliki banyak manfaat untuk kesehatan.\n\n " +
                "Stroberi dikemas dengan vitamin dan mineral seperti vitamin C dan K, folat, potasium, mangan, dan magnesium dan buah ini kaya kalori, kaya serat, yang kaya antioksidan dan polifenol. Menurut Database National Nutrient USDA, secangkir stroberi mengandung 49 kalori, menyediakan 3 gram serat, dan 12 gram karbohidrat.\n\n " +
                "Menurut survei, banyak anak-anak dan orang dewasa yang suka dengan stroberi. Bahkan, orang zaman dulu juga mengenal stroberi. Selain manusia, ada beberapa hewan yang menyukai stroberi. Keong, lalat, dan ngengat adalah tiga diantaranya.",

        "Rambutan baik dikonsumsi bagi pria maupun wanita, serta anak-anak hingga orang dewasa. Sayangnya masih ada orang yang enggan mengonsumsi buah rambutan karena tidak suka dengan bentuk kulitnya yang memiliki rambut.\n\n " +
                "Namun, rambutan memiliki kesegaran yang khas. Selain rasanya segar, rambutan bermanfaat bagi kesehatan mulai dari rambut, kulit, atau organ tubuh lainnya. Buah berasal dari Asia Tenggara ini memiliki nama latih Nephelium Lappaceum.\n\n " +
                "Tak kalah dengan jenis buah pada umumnya, rambutan juga kaya serat, vitamin, dan mineral. Seperti dirangkum dari Healthline, setiap 100 gram daging buah rambutan mengandung 1,3-2 gram serat. Serat tersebut tentu baik bagi kesehatan, terutama sistem pencernaan.\n\n " +
                "Apabila memetik atau mengonsumsi 5-6 buah rambutan, Anda sudah bisa memenuhi sekitar 50 persen kebutuhan vitamin C harian. Rambutan juga akan memberikan senyawa antioksidan guna mencegah berbagai penyakit.",

        "Salak termasuk buah yang mudah didapat nyaris sepanjang musim di Indonesia. Buah yang biasanya disajikan sebagai makanan pencuci mulut ini ternyata mengandung banyak nutrisi.\n\n " +
                "Buah dengan kulit bergerigi itu mengandung protein, vitamin C, serat, zat besi, kalsium, fosfor, hingga karbohidrat yang sangat bagus untuk kesehatan. Buah ini juga kaya akan kandungan beta-karoten ini yang merupakan antioksidan kuat yang berfungsi mencegah penyakit kardiovaskular, struk, bahkan kanker.\n\n " +
                "Buah yang memiliki nama latin Salacca zalacca ini ternyata digolongkan dalam suku palem-paleman, alias Arecaceae. Tak heran jika daun buah ini seperti kelapa. Bedanya, daun buah ini berbentuk pedang dengan pakal daun yang menyempit dan tangkai yang berduri.\n\n " +
                "Sebenarnya, asal tanaman ini tidak diketahui secara pasti. Namun, banyak ahli menduga bahwa buah salak berasal dari Asia Tenggara. Selain di Indonesia, buah ini juga banyak dibudidayakan di Thailand, Malaysia, dan Filipina.",

        "Buah mangga adalah salah satu buah tropis paling populer yang banyak tumbuh di Indonesia. Saat musimnya tiba, harganya bisa sangat terjangkau dan memuaskan dahaga penggemarnya.\n\n " +
                "Ada banyak jenis buah ini di Indonesia, seperti manalagi, harum manis, apel, dan kweni. Buah asal India ini pertama kali ditemukan sekitar 25--30 juta tahun yang lalu. Buah mangga bisa menyebar di seluruh dunia berkat para pedagang Eropa yang membawa buah dan bijinya ke benua-benua yang menjadi jalur perdagangannya.\n\n " +
                "Mangga memiliki sejumlah besar pektin, serat makanan yang larut yang secara efisien berkontribusi untuk menurunkan kadar kolesterol dalam darah.  Pektin juga dapat membantu mencegah perkembangan kanker prostat.\n\n " +
                "Mangga bermanfaat bagi wanita hamil karena buah ini memenuhi persyaratan zat besi. Dokter sering meresepkan tablet zat besi selama kehamilan, tetapi bukannya suplementasi, Anda dapat menikmati diet kaya zat besi yang sehat dengan jus mangga.",

        "Buah sirsak banyak ditemukan di daerah beriklim tropis. Buah bernama latin Annona muricata ini sangat mudah ditemukan di Indonesia dan umum dijadikan santapan. Buah sirsak sering dikonsumsi langung atau dijadikan jus, puding, atau campuran es buah.\n\n " +
                "kandungan vitamin C, kalsium hingga karbohidrat pada sirsak dipercaya dapat membantu mencegah berbagai macam penyakit. Sirsak juga berfungsi sebagai antioksidan yang mampu menghilangkan rasa sakit dan mencegah radikal bebas.\n\n " +
                "Manfaat sirsak selanjutnya yaitu dapat meningkatkan kekebalan tubuh. Kandungan vitamin C, B1 dan B2 pada sirsak berfungsi sebagai antioksidan penangkal radikal bebas. Sehingga hal ini dapat mencegah berbagai macam penyakit, seperti hipertensi hingga diabetes.\n\n " +
                "Selain itu, mengonsumsi sirsak secara teratur juga dapat melawan penyakit infeksi. Sehingga dapat menjaga kesehatan tubuh dan tidak mudah terkena penyakit.",

        "Indonesia adalah negara dengan garis pantai terpanjang ketiga di dunia. Salah satu tanaman yang biasa tumbuh di tepi pantai adalah pohon kelapa. Pohon yang bisa tumbuh hingga setinggi 30 meter ini disebut sebagai tanaman paling serbaguna. Mulai dari atas sampai bawah, semuanya bisa dimanfaatkan!\n\n " +
                "Berbicara soal buah kelapa, pikiran kita langsung terbayang dengan daging buahnya yang putih, tebal dan manis. Dalam satu cangkir (80 gram) daging kelapa segar, memiliki total 283 kalori, 3 gram protein, 10 gram karbohidrat, 27 gram lemak, 5 gram gula, 7 gram serat dan mencukupi 60 persen kebutuhan zat mangan harian.\n\n " +
                "Mengonsumsi air kelapa bisa menurunkan radikal bebas, menurunkan kadar gula darah, melawan diabetes, mencegah batu ginjal, mengurangi risiko terkena masalah jantung, menurunkan tekanan darah, mencegah dehidrasi dan mengandung antioksidan. Satu gelas yang kaya nutrisi!\n\n " +
                "Minyak kelapa adalah kondisioner alami untuk rambut. Apabila digunakan rutin, minyak kelapa bisa membuat rambut lembut dan ternutrisi. Minyak kelapa juga banyak dipakai untuk perawatan luka bakar, melembapkan kulit dan melindungi kulit dari sinar matahari. Kandungan vitamin E di dalamnya juga bisa melembutkan kulit.",

        "ecil dan manis, buah duku seringkali dijadikan camilan favorit, terutama saat musim panen sudah tiba. Namun, tidak bisa dipungkiri, manfaat buah duku untuk kesehatan memang belum menyamai popularitasnya sebagai kudapan biasa. Namun Duku tetap ada manfaatnya, simak penjelasannya.\n\n " +
                "Mengonsumsi 100 gram buah duku segar, dinilai dapat memenuhi 8-11% rekomendasi konsumsi serat harian. Seperti yang sudah kita ketahui, peran serat dalam menjaga kesehatan tubuh sangatlah penting, seperti melancarkan pencernaan hingga mengurangi risiko terjadinya penyakit jantung.\n\n " +
                "Ekstrak yang didapatkan dari biji buah duku, dinilai berpotensi untuk membantu pencegahan malaria. Selain itu, kulit dan daun dari tanaman ini mengandung senyawa kimia yang dinilai dapat mencegah pertumbuhan Plasmodium falciparum, parasit penyebab malaria.\n\n " +
                "Komponen yang terdapat di batang serta biji buah duku juga dipercaya dapat meredakan inflamasi atau peradangan di tubuh. Secara tradisional, getah yang keluar dari batang duku digunakan untuk mengatasi pembengkakan serta perlukaan dikulit.",

        "Semangka adalah salah satu jenis buah yang biasa dijadikan pencuci mulut, alias makanan penutup. Buah yang satu ini cukup populer dan digemari, mulai anak-anak hingga orang dewasa.\n\n " +
                "Selain mudah dicari dengan harga murah, semangka juga memberikan manfaat bagi kesehatan tubuh. Tak hanya itu, bahkan semangka penting dikonsumsi bagi pria dan wanita.\n\n " +
                "Semangka mengandung mineral tinggi, sehingga bisa membuat tubuh menjadi lebih segar. Buah bercangkang hijau loreng ini memiliki warna daging yang berbeda, ada yang merah dan kuning.\n\n " +
                "Buah semangka mengandung kalium, protein, vitamin A, B6, C, E, dan K. Semangka juga memiliki senyawa zat besi, sodium, mangan, dan masih banyak lagi.",

        "Markisa merupakan salah satu buah yang memanfaatkan bijinya untuk dikonsumsi. Buah markisa mempunyai ciri khas dengan rasa yang kecut sedikit manis. Tanaman markisa berhabitat asli dari daerah pegunungan yang sejuk, tetapi tanaman ini juga bisa ditanam dan berbuah di daerah dataran rendah.\n\n " +
                "Buah markisa dengan nama latin \"passiflora quadrangularis L\" yang dibudidayakan di Indonesia ada beberapa jenis buah markisa, yakni markisa ungu (passiflora edulis var. Edulis), markisa konyal (passiflora lingularis), markisa kuning (passiflora edulis var. Flevicarpa), serta markisa erbis (passiflora quadrangularis). Selain perbedaan dari warna dan ukuran, perbedaan lainnya yakni adalah soal rasanya.\n\n " +
                "Selain itu, manfaat buah markisa kuning, markisa ungu, markisa konyal, dan markisa erbis tentunya memiliki manfaat masing-masing yang bermanfaat untuk kesehatan. Dalam pembahasan kali ini lebih membahas tentang manfaat buah markisa kuning yang menyimpan banyak manfaat untuk kesehatan tubuh.\n\n " +
                "Salah satu manfaatnya yaitu dapat mencegah pertumbuhan sel kanker dalam tubuh. Kanker merupakan salah satu penyakit yang selalu menjadi momok menakutkan di masyarakat. Pencegahan terhadap pertumbuhan sel kanker bisa dicegah sejak dini dengan memanfaatkan dan mengonsumsi makanan yang dapat mencegah pertumbuhan sel kanker dalam tubuh.",

        "Nanas (Ananas comosus) adalah buah tropis yang sangat lezat dan sehat. Buah nanas dapat memiliki berat hingga delapan kilogram dan memiliki rasa yang manis dan asam, serta mengandung pektin seperti serat yang memberikan tekstur kenyal pada buah.\n\n " +
                "Pohon nanas adalah tanaman asli Paraguay dan namanya berasal dari bahasa Spanyol piña, yang berarti biji pinus. Ini dianggap sebagai tanaman paling signifikan secara ekonomi dalam keluarga tanaman Bromeliaceae.\n\n " +
                "Manfaat nanas yang cukup penting ialah mampu mengontrol kesehatan pencernaan. Nanas mengandung sekelompok enzim pencernaan yang dikenal sebagai bromelain. Senyawa tersebut berfungsi sebagai protease, yang memecah molekul protein menjadi asam amino dan peptide.\n\n " +
                "Anak-anak yang memakan nanas memiliki risiko infeksi virus dan bakteri yang jauh lebih rendah. Juga, anak-anak yang paling banyak makan nanas memiliki hampir empat kali lipat sel darah putih (granulosit) yang melawan penyakit daripada dua kelompok lainnya."

    )

    private val wikiLink = arrayListOf(
        "https://id.wikipedia.org/wiki/Apel",
        "https://id.wikipedia.org/wiki/Jeruk",
        "https://id.wikipedia.org/wiki/Pisang",
        "https://id.wikipedia.org/wiki/Anggur",
        "https://id.wikipedia.org/wiki/Pir",
        "https://id.wikipedia.org/wiki/Stroberi_kebun",
        "https://id.wikipedia.org/wiki/Rambutan",
        "https://id.wikipedia.org/wiki/Salak",
        "https://id.wikipedia.org/wiki/Mangga",
        "https://id.wikipedia.org/wiki/Sirsak",
        "https://id.wikipedia.org/wiki/Kelapa",
        "https://id.wikipedia.org/wiki/Duku",
        "https://id.wikipedia.org/wiki/Semangka",
        "https://id.wikipedia.org/wiki/Markisa",
        "https://id.wikipedia.org/wiki/Nanas"
    )

    private val iconID = arrayListOf(
        R.drawable.icon_apple,
        R.drawable.icon_orange,
        R.drawable.icon_banana,
        R.drawable.icon_grape,
        R.drawable.icon_pear,
        R.drawable.icon_strawberry,
        R.drawable.icon_rambutan,
        R.drawable.icon_salak,
        R.drawable.icon_mango,
        R.drawable.icon_soursop,
        R.drawable.icon_coconut,
        R.drawable.icon_duku,
        R.drawable.icon_watermelon,
        R.drawable.icon_markisa,
        R.drawable.icon_pineapple
    )

    private val imageID = arrayListOf(
        R.drawable.real_apple,
        R.drawable.real_orange,
        R.drawable.real_banana,
        R.drawable.real_grape,
        R.drawable.real_pear,
        R.drawable.real_strawberry,
        R.drawable.real_rambutan,
        R.drawable.real_salak,
        R.drawable.real_mango,
        R.drawable.real_soursop,
        R.drawable.real_coconut,
        R.drawable.real_duku,
        R.drawable.real_watermelon,
        R.drawable.real_markisa,
        R.drawable.real_pineapple
    )

    fun getFruitsList(): ArrayList<Fruit> {
        val tempList = arrayListOf<Fruit>()
        for (i in name.indices) {
            val fruit = Fruit(
                name        = this.name[i],
                rawColor    = this.rawColor[i],
                shortDesc   = this.shortDesc[i],
                fullDesc    = this.fullDesc[i],
                wikiLink    = this.wikiLink[i],
                iconID      = this.iconID[i],
                imageID     = this.imageID[i]
            )
            tempList.add(fruit)
        }
        return tempList
    }

    fun getFruitX(position: Int): Fruit = Fruit(
            name        = this.name[position],
            rawColor    = this.rawColor[position],
            shortDesc   = this.shortDesc[position],
            fullDesc    = this.fullDesc[position],
            wikiLink    = this.wikiLink[position],
            iconID      = this.iconID[position],
            imageID     = this.imageID[position]
        )

}