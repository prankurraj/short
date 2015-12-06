package edu.boun.cmpe451.group2.android.recipe;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import edu.boun.cmpe451.group2.android.R;
import edu.boun.cmpe451.group2.android.SemanticTagActivity;

/**
 * A recipe-add screen
 */
public class RecipeAddActivity extends AppCompatActivity {

    /**
     * Id to identity READ_CONTACTS permission request.

    private static final int REQUEST_READ_CONTACTS = 0;

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.

    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello", "bar@example.com:world"
    };
    */

    // UI references.
    private EditText recipeName;
    private EditText recipeDescription;
    private AutoCompleteTextView ingredientName;
    private EditText ingredientQuantity;
    private Button recipeAddButton;
    private Button ingredientAddButton;

    String[] ingredients = { "Tomato", "Salt", "Egg", "Potato" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recipe_add);

        recipeName = (EditText) findViewById(R.id.recipe_add_name_text);

        recipeDescription = (EditText) findViewById(R.id.recipe_add_description_text);

        ingredientName = (AutoCompleteTextView) findViewById(R.id.recipe_add_ingredient_text);
        ingredientQuantity  = (EditText) findViewById(R.id.recipe_add_ingredient_quantity);
        ingredientAddButton = (Button) findViewById(R.id.recipe_add_ingredient_button);

        Button semanticTtagAddButton =(Button) findViewById(R.id.semantic_tag_add_button);
        semanticTtagAddButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SemanticTagActivity.class));
            }
        });

        recipeAddButton = (Button) findViewById(R.id.recipe_add_button);

        //  ingredient listview

        ListView liste = (ListView) findViewById(R.id.recipe_add_ingredient_listView );

        ArrayAdapter<String> dataAdaptor = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, ingredients);

        liste.setAdapter(dataAdaptor);
        //

        ArrayAdapter<String> dataAdaptor2 = new ArrayAdapter<String>
                (this, android.R.layout.simple_dropdown_item_1line, ingredients);
        ingredientName.setAdapter(dataAdaptor2);

    }
}