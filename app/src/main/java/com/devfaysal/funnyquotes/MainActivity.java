package com.devfaysal.funnyquotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ITEMS();

        recyclerView = findViewById(R.id.recyclerView);
        MainAdapter mainAdapter = new MainAdapter();
        recyclerView.setAdapter(mainAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }



    private class MainAdapter extends RecyclerView.Adapter <MainAdapter.HomeViewHolder>{

        @NonNull
        @Override
        public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.main_items, parent, false);

            return new HomeViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
            hashMap = arrayList.get(position);

            String name = hashMap.get("title");
            holder.title.setText(name);


            holder.lay_click.setOnClickListener(view -> {

                assert name != null;

                if (name.equals("Funny Quotes 01")){
                    FUNNY_1();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                } else if (name.equals("Funny Quotes 02")){
                    FUNNY_2();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                } else if (name.equals("Funny Quotes 03")){
                    FUNNY_3();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                } else if (name.equals("Funny Quotes 04")){
                    FUNNY_4();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                } else if (name.equals("Funny Quotes 05")){
                    FUNNY_5();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                } else if (name.equals("Funny Quotes 06")){
                    FUNNY_6();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                }


            });
        }


        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class HomeViewHolder extends RecyclerView.ViewHolder{

            TextView title;
            LinearLayout lay_click;

            public HomeViewHolder(@NonNull View itemView) {
                super(itemView);

                title = itemView.findViewById(R.id.title);
                lay_click = itemView.findViewById(R.id.lay_click);

            }
        }

    }




    public void ITEMS(){

        hashMap = new HashMap<>();
        hashMap.put("title", "Funny Quotes 01");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Funny Quotes 02");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Funny Quotes 03");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Funny Quotes 04");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Funny Quotes 05");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Funny Quotes 06");
        arrayList.add(hashMap);



    }


    public void FUNNY_1(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("title", "I'm sick of following my dreams, man. I'm just going to ask where they're going and hook up with ’em later.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Gentlemen, you can't fight in here. This is the war room.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "My mother always used to say: The older you get, the better you get, unless you’re a banana.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Halloween is the beginning of the holiday shopping season. That’s for women. The beginning of the holiday shopping season for men is Christmas Eve.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Before you criticize someone, you should walk a mile in their shoes. That way when you criticize them, you are a mile away from them and you have their shoes.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Before you marry a person, you should first make them use a computer with slow Internet to see who they really are.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I love being married. It's so great to find that one special person you want to annoy for the rest of your life.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Ned, I would love to stand here and talk with you—but I’m not going to.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "When your mother asks, ‘Do you want a piece of advice?’ it is a mere formality. It doesn’t matter if you answer yes or no. You’re going to get it anyway.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I want my children to have all the things I couldn't afford. Then I want to move in with them.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Never follow anyone else’s path. Unless you’re in the woods and you’re lost and you see a path. Then by all means follow that path.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Insomnia sharpens your math skills because you spend all night calculating how much sleep you’ll get if you’re able to ‘fall asleep right now.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Breaking up is like knocking over a Coke machine. You can’t do it in one push; you got to rock it back and forth a few times, and then it goes over.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I’m not superstitious, but I am a little stitious.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I walk around like everything’s fine, but deep down, inside my shoe, my sock is sliding off.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I haven't spoken to my wife in years. I didn't want to interrupt her.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I used to sell furniture for a living. The trouble was, it was my own.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "There’s nothing wrong with you that an expensive operation can’t prolong.");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }


    public void FUNNY_2(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("title", "Girls use photoshop to look beautiful.. Boys use photoshop to show their creativity.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " You can never buy Love... But still you have to pay for it...\n");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " Did anyone else notice the sound if you click the like button on my status?");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " I live in a world of fantasy, so keep your reality away from me!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " My biggest concern in life is actually how my online friends can be informed of my death...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Who needs television when there is so much drama on Facebook.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " Save water - Drink beer!\n");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " Dear Lord, there is a bug in your software... it's called Monday, please fix it.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " Always wear cute pajamas to bed you'll never know who you will meet in your dreams.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "God is really creative, I mean just look at me");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Decided to burn lots of calories today so I set a fat kid on fire.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "When I'm on my death bed, I want my final words to be 'I left one million dollars in the...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " I wake up when I cant hold my pee in any longer.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " My father always told me, find a job you love and you'll never have to work a day in your life.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " Life is too short smile while you still have teeth...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " My study period = 15 minutes. My break time = 3 hours.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " I'm jealous of my parents... I'll never have a kid as cool as theirs!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " Here my dad comes on whatsapp... From now on my status would be '***no status***' or just a smiley..");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }


    public void FUNNY_3(){
        arrayList = new ArrayList<>();


        hashMap = new HashMap<>();
        hashMap.put("title", " Don't kiss behind the garden, Love is blind but the neighbors are not.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Friends are forever, until they get in a relationship ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "C.L.A.S.S - Come late and start sleeping ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " People who exercise live longer, but what's the point when those extra years are spent at gym.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Relationship Status: Looking for a FREE WiFi connection.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "It may look like I'm deep in thought, but 99% of the time I'm just thinking about what food to eat later.\n");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " When a newly married man looks happy, we know why. But when a ten-year married man looks happy, we wonder why.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Sorry about those texts I sent you last night, my phone was drunk.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "We are WTF generation .... WhatsApp, Twitter and Facebook ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " Having a best friend with the same mental disorder is a blessing. LOL");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " This is the beginning of the sentence you just finished reading.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " WoW now I’m a graduate... Now thermometer is not the only thing that has degrees without brains.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " Me and my wife lived happily for 25 years and then we met…\n");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Good Morning, let the stress begin...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " Don’t settle for good. Demand Great!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Hakuna Matata – The great motto to live life!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", " Price is what you pay. Value is what you get.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Eat - Sleep - Regret - Repeat.");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }


    public void FUNNY_4(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("title", "Sometimes i just wish i’ could fast forward the time to see if in the end it’s all worth it.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "People are like music some say the truth and rest, just noise.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "We are all part of the ultimate statistic – ten out of ten die.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "It’s not how tragically we suffer but how miraculously we live.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Love is that state of mind when a karan johar film becomes bearable.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Dream as if you’ll live forever... Live as if tomorrow is last one.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Always remember you are UNIQUE - Just like everybody else.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "You don’t have to like me... I am not a facebook status.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "The only difference between a good day and a bad day is your attitude.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Don’t be too optimistic. The light at the end of the tunnel may be another train.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "At last got to know how to loose weight in 10 days: Just turn your head right then left and repeat whenever offered any food :)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Life is too short. Don't waste it removing pen drive safely.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Whatsapp status is loading...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Think about it ..every time we look back at ourselves five years ago we think we were an idiot.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Happiness is when 'Last seen at' changes to 'Online' and then to 'Typing...'");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I was not busy to be online… I had just gave up on my life when I picked up this girls phone and saw my contact name as 'Free Recharge'");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I Am Not Special, I Am Just Limited Edition!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I’am looking for a bank loan which can perform two things..give me a Loan and then leave me Alone.");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }


    public void FUNNY_5(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("title", "Math Rule: If it seems easy, you’re doing it wrong.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "They say we learn from our mistakes. So, I'm making as many as possible! Soon I will be a genius :-B");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Waiting for Wi-Fi Network...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Sleep till you’re hungry... Eat till you’re sleepy.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "There are 3 types of people in the world- vegetarian, non-vegetarian and Tuesday / Saturday");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Coins always make sound but the currency notes are always silent! that’s why I’m always calm and silent...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "One day, I’m gonna make the onions cry.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Second chances are for losers, either we do it in first place or live it for others.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Dear Math, please grow up and solve your own problems, I’m tired of solving them for you.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "We live in a society were pizza gets to your house before police");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "One wise guy invented mobile application Whatsapp and his wife added last seen feature...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Don’t be happy.I don’t Really forgive people,I just pretend like it’s ok and wait for my turn to destroy them.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Jealousy = I actually care about you.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Once a cheater always a repeater...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "FACT: Every piece of plastic ever made still exists. Say no to Plastic.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I wanna be nice but some people are so annoying.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I'm soo poor... I can't even pay attention");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I hate people who steal my ideas before I think of them...");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }


    public void FUNNY_6(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("title", "It's cute when your crush's crush is uuh ;-)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "People say you cant live without love, but I think oxygen is more important.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "If your dog barks and enemies laugh take it serious.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Vegetarians, if you want animals to live, why do you eat their food.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I will marry the girl, who look pretty in her Adhaar card.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Team work is important; it helps to put the blame on someone else.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "After marriage, the other man’s wife looks more beautiful.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Act crazy, don't regret, do things you would never ever do because life is short so live it up! :)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I will kill you with my awesomeness...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Always borrow money from a pessimist. He won’t expect it back.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "The best way to lie is to tell the truth, carefully edited truth.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I shouldn't have to earn you time or attention, you should want to give it!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Remember how you treated me so when I treat you like that you can understand why!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Silence doesn't always mean you're mad... sometimes it just means you have nothing to say.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I'm so awesome that I wish I could be you, just so I could hang out with me!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "That awkward moment when the awkward moment get even more awkward!");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Totally available! Please disturb me...");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Nothing is lost until mom can't find it.");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }



}