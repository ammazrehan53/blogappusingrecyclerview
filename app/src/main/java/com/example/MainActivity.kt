package com.example

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.blogappusingrecyclerview.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = ArticlesAdapter(getarticles())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
    fun getarticles(): List<Article> {
        return listOf(
            Article(
                R.drawable.img1,
                "Jeep and Dodge hit panic mode",
                "In a bold move to combat plummeting sales in the U.S., Stellantis — the parent company of automotive brands including Jeep, Dodge, Ram, and Chrysler— has announced that it will offer discounts on 2024 and older model-year vehicles through the end of the year.  The announcement comes as the company works to shrink its ballooning inventory over the coming months.  Stellantis scrambles to remedy declining U.S. sales Stellantis recently reported a 21% year-over-year drop in U.S. brand sales during the second quarter of 2024, sending its stock price tumbling as the company looks to reverse the trend through greater discounts for prospective buyers. Jeep, Ram, and Dodge all reported notable declines, with Ram sales down by 26%, Dodge by 16%, and Jeep trailing behind with a 9% decrease.\")\n"
            ),
            Article(
                R.drawable.img2,
                "In a bold move to combat plummeting sales in the U.S.,",
                "I Automotive crashes are one of the leading causes of death in the United States today, with 100 people killed every day in collisions, according to the U.S. Centers for Disease Control.\n" +
            "\n" +
                    "Yet, a suite of new safety systems designed to make driving safer received a cold reception from many drivers as manufacturers began introducing the tech over the last decade. Now, a new study by the Insurance Institute for Highway Safety (IIHS) found that U.S. drivers are finally warming up to the potentially life-saving features."
        ),
            Article(
                R.drawable.img3,
                "Jeep and Dodge hit panic mode",
                "In a bold move to combat plummeting sales in the U.S.,"
            ),
            Article(
                R.drawable.img3,
                "Could Lexus be building a true driver’s car for enthusiasts?",
                "If the doom and gloom of the looming EV push has got you down, chin up! Lexus may soon unveil a 600 hp version of their now-decade-old RC coupe. The best part is, sit down for this one, it might have a manual transmission.)"

            ),
            Article(
                R.drawable.img4,
                "Photos of the Rolls-Royce Spectre Lunaflair",
                "Rolls-Royce Spectre Lunaflair\\n\" +\n" +
                        "                    \"One-of-one Rolls-Royce Spectre Lunaflair"
            ),
            Article(
                R.drawable.img5,
                "Nissan is speeding toward a financial cliff. Can they turn things around in time?",
                "Nissan is facing one of its toughest financial challenges in recent history.\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Late last week, the Japanese automaker reported dismal global sales figures, raising concerns that it may fall short of its fiscal year profit forecast, which the company already lowered back in July due to poor sales. Operating profit plunged by 99% last quarter, and sales dropped 5.5% in August, marking the company’s fifth consecutive month of decline, according to Bloomberg News."
            ),
            Article(
                R.drawable.img6,
                "2025 Chevy Blazer RS EV worth \$54,295? Let's find out.",
                "Chevrolet’s foray into the EV market hasn't exactly been smooth. In fact, they’ve oscillated between abject failures, like the Volt, and confusing withdrawals like the Bolt. The bowtie-shaped badge is now hoping to get it right with the Blazer EV—and they may have found the sweet spot with its penultimate trim—the Blazer EV RS.\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Entering a crowded market with the Blazer EV RS\\n\" +\n" +
                        "                    \"The Blazer EV RS is attempting to force its way into a very competitive segment. With an MSRP of \\\$54,295, the Blazer RS is positioning itself as a serious contender in the hotly contested premium crossover market. This category includes major players from the EV market, solid competition from Asian automakers, an American icon, and some precision-engineered German offerings. So, can it hold its own?"
            ),
            Article(
                R.drawable.img7,
                "Rolls-Royce’s Spectre Lunaflair has a paint job you’ll never see again—here’s why",
                "Although expensive, the sale of a Rolls-Royce isn’t usually a newsworthy event. However, the Spectre Lunaflair was considered special enough that the company thought it merited its own press release. If the photos are even half as stunning as the in-person result, they made the right decision.\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"By the moon’s pale light\\n\" +\n" +
                        "                    \"The Spectre Lunaflair's unique paint technology was developed to mimic an astrological phenomenon known as a ‘lunar halo’. Lunar halos appear as an eerie, ethereal ring of light with a rainbow ring edge, especially on cold nights with a full moon.\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"This optical trick occurs naturally when ice crystals in the upper atmosphere catch the moonlight; light reflected from the sun then acts as a giant composite lens to refract moonlight like millions of tiny prisms."
            ),
            Article(
                R.drawable.img8,
                "2025 Toyota 4Runner vs 2024 Toyota Land Cruiser: Exploring key differences",
                "Toyota is on a roll with the 4Runner and Land Cruiser\\n\" +\n" +
                        "                    \"The legendary Japanese automaker has been releasing redesigned versions of some of its most iconic models. Among the highlights are the 2024 Toyota Land Cruiser and the 2025 Toyota 4Runner. The Land Cruiser was revealed in February 2024, followed by the 2025 Toyota 4Runner in April.\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Both models share undeniable similarities, but the differences between them are where things get interesting. Let’s break down how the 2024 Toyota Land Cruiser and 2025 Toyota 4Runner differ in terms of luxury, powertrain options, trims, and more."
            ),
            Article(
                R.drawable.img9,
                "2025 Nissan Armada vs. 2024 Nissan Armada: Invigorating changes abound",
                "Competitors to the 2025 Nissan Armada take note — the automaker has given the model a substantial refresh for the new year.\\n\" +\n" +
                        "                    \"\\n\" +\n" +
                        "                    \"Now in its third generation, the Armada, based on the rugged and globally-known Nissan Patrol, has an even stronger connection to that popular SUV in terms of its off-road capabilities. Its subsequent new trim, the Pro-4X, was made for the trail and now joins the SV, SL, Platinum, and Platinum Reserve in the lineup. \")\n" +
                        "          "
            ),

        )
    }

}