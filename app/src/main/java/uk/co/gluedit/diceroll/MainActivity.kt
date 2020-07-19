package uk.co.gluedit.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result on the screen.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener {
            rollDice()
        }

        rollDice() // when the app starts
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val diceRoll = Dice().roll()
        val diceImage: ImageView = findViewById(R.id.imgDice)
        // load the drawable resource based on the roll result
        diceImage.setImageResource(
            when (diceRoll) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        )
        // update the content description
        diceImage.contentDescription = diceRoll.toString()
    }

}