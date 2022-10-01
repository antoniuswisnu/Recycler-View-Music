package com.papb1.pertemuan7.recyclerview;

import java.util.ArrayList;

class MusicData {
    private static String[] musicNames = {
            "Heavydirtysoul",
            "Good Day",
            "My Blood",
            "Stressed Out",
            "Shy Away",
            "Holding On To You",
            "Ride",
            "Saturday",
            "Car Radio",
            "Polarize"
    };

    private static String[] musicLyric = {
            "There's an infestation in my mind's imagination\n" +
                    "I hope that they choke on smoke\n" +
                    "'Cause I'm smokin' 'em out the basement\n" +
                    "This is not rap, this is not hip-hop\n" +
                    "Just another attempt to make the voices stop\n" +
                    "Rappin' to prove nothin', just writing to say somethin'\n" +
                    "'Cause I wasn't the only one who wasn't rushin' to say nothin'\n" +
                    "This doesn't mean I lost my dream\n" +
                    "It's just right now I got a really crazy mind to clean\n" +
                    "\n" +
                    "Gangsters don't cry\n" +
                    "Therefore, therefore I'm\n" +
                    "Mr. Misty-eyed, therefore I'm\n" +
                    "\n" +
                    "Can you save?\n" +
                    "Can you save my?\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "\n" +
                    "Can you save?\n" +
                    "Can you save my?\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "\n" +
                    "For me, for me\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "For me, for me\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "\n" +
                    "Nah, I didn't understand a thing you said\n" +
                    "If I didn't know better I'd guess you're all already dead\n" +
                    "Mindless zombies walkin' around with a limp and a hunch\n" +
                    "Sayin' stuff like, \"You only live once\"\n" +
                    "You've got one time to figure it out\n" +
                    "One time to twist and one time to shout\n" +
                    "One time to think and I say we start now\n" +
                    "Sing it with me if you know what I'm talkin' about\n" +
                    "\n" +
                    "Gangsters don't cry\n" +
                    "Therefore, therefore I'm\n" +
                    "Mr. Misty-eyed, therefore I'm\n" +
                    "\n" +
                    "Can you save?\n" +
                    "Can you save my?\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "\n" +
                    "Can you save?\n" +
                    "Can you save my?\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "\n" +
                    "For me, for me\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "For me, for me\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "\n" +
                    "Death inspires me like a dog inspires a rabbit\n" +
                    "Death inspires me like a dog inspires a rabbit\n" +
                    "\n" +
                    "Can you save?\n" +
                    "Can you save my?\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "\n" +
                    "Can you save?\n" +
                    "Can you save my?\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "\n" +
                    "For me, for me\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "For me, for me\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "\n" +
                    "Can you save?\n" +
                    "Can you save my?\n" +
                    "Can you save my heavydirtysoul?\n" +
                    "\n" +
                    "Can you save?\n" +
                    "Can you save my?\n" +
                    "Can you save my heavydirtysoul?",
            "I can feel my saturation leaving me slowly\n" +
                    "Broke the news on Mom's vacation\n" +
                    "Oh, but you know me\n" +
                    "\n" +
                    "Low-key I'm alright\n" +
                    "Would you say you depend on the weather?\n" +
                    "My sunshine is a buzz and a light, I'll be singing out\n" +
                    "I know it's hard to believe me, it's a good day\n" +
                    "\n" +
                    "Lost my job, my wife and child\n" +
                    "Homie just sued me\n" +
                    "Shoot my life in shoot 'em up style\n" +
                    "Her favorite movies\n" +
                    "\n" +
                    "Low-key I'm alright\n" +
                    "Would you say you depend on the weather?\n" +
                    "My sunshine is a buzz and a light, I'll be singing out\n" +
                    "I know it's hard to believe me, it's a good day\n" +
                    "\n" +
                    "Today's a good day\n" +
                    "Never know, never know\n" +
                    "When the next one will show, it'll show\n" +
                    "So I'ma sing my soul, I'ma sing my soul (Da-da-da)\n" +
                    "Today's a good day\n" +
                    "Never know, never know\n" +
                    "When the next one will show, it'll show\n" +
                    "So I'ma sing my soul, I'ma sing my soul, yeah\n" +
                    "(So I'ma sing my soul, I'ma sing my soul)\n" +
                    "\n" +
                    "I'm alright\n" +
                    "Would you say you depend on the weather?\n" +
                    "My sunshine is a buzz and a light, I'll be singing out\n" +
                    "I know it's hard to believe me, it's a good day\n" +
                    "\n" +
                    "I'm alright\n" +
                    "I'm alright\n" +
                    "I think that I'm alright\n" +
                    "It's a good day",
            "When everyone you thought you knew,\n" +
                    "Deserts your fight, I'll go with you.\n" +
                    "You're facing down a dark hall,\n" +
                    "I'll grab my light, and go with you.\n" +
                    "\n" +
                    "I'll go with you, I'll go with you.\n" +
                    "I'll go with you, I'll go with you.\n" +
                    "I'll go with you, I'll go with you.\n" +
                    "I'll go with you.\n" +
                    "\n" +
                    "Surrounded and up against a wall,\n" +
                    "I'll shred them all, and go with you.\n" +
                    "When choices end, you must defend,\n" +
                    "I'll grab my bat, and go with you.\n" +
                    "\n" +
                    "I'll go with you, I'll go with you.\n" +
                    "I'll go with you, yeah.\n" +
                    "\n" +
                    "Stay with me. No, you don't need to run.\n" +
                    "Stay with me, my blood. You don't need to run.\n" +
                    "Stay with me. No, you don't need to run.\n" +
                    "Stay with me, my blood. You don't need to run.\n" +
                    "\n" +
                    "If there comes a day,\n" +
                    "People posted up at the end of your driveway,\n" +
                    "They're calling for your head,\n" +
                    "And they're calling for your name,\n" +
                    "I'll bomb down on them, I'm coming through.\n" +
                    "Do they know I was grown with you?\n" +
                    "If they're here to smoke, know I'll go with you,\n" +
                    "Just keep it outside, keep it outside, yeah.\n" +
                    "\n" +
                    "Stay with me. No, you don't need to run.\n" +
                    "Stay with me, my blood. You don't need to run.\n" +
                    "Stay with me. No, you don't need to run.\n" +
                    "Stay with me, my blood. You don't need to run.\n" +
                    "\n" +
                    "You don't need to run, you don't need to run.\n" +
                    "You don't need to run.\n" +
                    "\n" +
                    "If you find yourself in a lion's den,\n" +
                    "I'll jump right in and pull my pin, and go with you.\n" +
                    "\n" +
                    "I'll go with you, I'll go with you.\n" +
                    "I'll go with you, I'll go with you. (You don't need to run)\n" +
                    "I'll go with you, I'll go with you. (You don't need to run)\n" +
                    "My blood, I'll go with you, yeah.\n" +
                    "\n" +
                    "Stay with me. No, you don't need to run.\n" +
                    "Stay with me, my blood. You don't need to run.\n" +
                    "Stay with me. No, you don't need to run.\n" +
                    "Stay with me, my blood. You don't need to run.\n" +
                    "\n" +
                    "You don't need to run, you don't need to run.\n" +
                    "You don't need to run, you don't need to run.\n" +
                    "\n" +
                    "Stay with me. No, you don't need to run.\n" +
                    "Stay with me, my blood.",
            "I wish I found some better sounds no one's ever heard\n" +
                    "I wish I had a better voice that sang some better words\n" +
                    "I wish I found some chords in an order that is new\n" +
                    "I wish I didn't have to rhyme every time I sang\n" +
                    "I was told when I get older, all my fears would shrink\n" +
                    "But now I'm insecure and I care what people think\n" +
                    "\n" +
                    "My name's Blurryface and I care what you think\n" +
                    "My name's Blurryface and I care what you think\n" +
                    "\n" +
                    "Wish we could turn back time\n" +
                    "To the good ol' days\n" +
                    "When our momma sang us to sleep\n" +
                    "But now we're stressed out\n" +
                    "\n" +
                    "Wish we could turn back time\n" +
                    "To the good ol' days\n" +
                    "When our momma sang us to sleep\n" +
                    "But now we're stressed out\n" +
                    "\n" +
                    "We're stressed out\n" +
                    "\n" +
                    "Sometimes a certain smell will take me back to when I was young\n" +
                    "How come I'm never able to identify where it's coming from?\n" +
                    "I'd make a candle out of it, if I ever found it\n" +
                    "Try to sell it, never sell out of it, I'd probably only sell one\n" +
                    "It'd be to my brother, 'cause we have the same nose\n" +
                    "Same clothes, homegrown\n" +
                    "A stone's throw from a creek we used to roam\n" +
                    "But it would remind us of when nothing really mattered\n" +
                    "Out of student loans and treehouse homes\n" +
                    "We all would take the latter\n" +
                    "\n" +
                    "My name's Blurryface and I care what you think\n" +
                    "My name's Blurryface and I care what you think\n" +
                    "\n" +
                    "Wish we could turn back time\n" +
                    "To the good ol' days\n" +
                    "When our momma sang us to sleep\n" +
                    "But now we're stressed out\n" +
                    "\n" +
                    "Wish we could turn back time\n" +
                    "To the good ol' days\n" +
                    "When our momma sang us to sleep\n" +
                    "But now we're stressed out\n" +
                    "\n" +
                    "We used to play pretend, give each other different names\n" +
                    "We would build a rocket ship and then we'd fly it far away\n" +
                    "Used to dream of outer space, but now they're laughing at our face\n" +
                    "Saying, \"Wake up, you need to make money\"\n" +
                    "Yeah\n" +
                    "We used to play pretend, give each other different names\n" +
                    "We would build a rocket ship and then we'd fly it far away\n" +
                    "Used to dream of outer space, but now they're laughing at our face\n" +
                    "Saying, \"Wake up, you need to make money\"\n" +
                    "Yeah\n" +
                    "\n" +
                    "Wish we could turn back time\n" +
                    "To the good ol' days\n" +
                    "When our momma sang us to sleep\n" +
                    "But now we're stressed out\n" +
                    "\n" +
                    "Wish we could turn back time\n" +
                    "To the good ol' days\n" +
                    "When our momma sang us to sleep\n" +
                    "But now we're stressed out\n" +
                    "\n" +
                    "Used to play pretend, used to play pretend, bunny\n" +
                    "We used to play pretend, wake up, you need the money\n" +
                    "Used to play pretend, used to play pretend, bunny\n" +
                    "We used to play pretend, wake up, you need the money\n" +
                    "\n" +
                    "Used to play pretend, give each other different names\n" +
                    "We would build a rocket ship and then we'd fly it far away\n" +
                    "Used to dream of outer space, but now they're laughing at our face\n" +
                    "Saying, \"Wake up, you need to make money\"",
            "When I get home\n" +
                    "You better not be there\n" +
                    "We're placin' bets you won't\n" +
                    "Shed your modesty\n" +
                    "And the only thing to leave behind\n" +
                    "Is your own skin on the floor\n" +
                    "\n" +
                    "Don't you shy away (Ah-ah-ah)\n" +
                    "Manifest a ceiling\n" +
                    "When you shy away (Ah-ah-ah)\n" +
                    "Searchin' for that feelin'\n" +
                    "Just like an \"I love you\" (Ooh, ooh)\n" +
                    "That isn't words (Ooh, ooh)\n" +
                    "Like a song he wrote, that's never heard (Ah-ah-ah)\n" +
                    "Don't you shh…\n" +
                    "\n" +
                    "When you get home\n" +
                    "You barely recognize the pictures\n" +
                    "They put in a frame\n" +
                    "'Cause you shed your modеsty\n" +
                    "Don't circle the track\n" +
                    "Take what you havе\n" +
                    "And leave your skin on the floor\n" +
                    "\n" +
                    "Don't you shy away (Ah-ah-ah)\n" +
                    "Manifest a ceiling\n" +
                    "When you shy away (Ah-ah-ah)\n" +
                    "Searchin' for that feelin'\n" +
                    "Just like an \"I love you\" (Ooh, ooh)\n" +
                    "That isn't words (Ooh, ooh)\n" +
                    "Like a song he wrote (Ah-ah-ah)\n" +
                    "That's never heard\n" +
                    "\n" +
                    "When I get home\n" +
                    "Boy, you better not be there\n" +
                    "You're long gone\n" +
                    "Shed your modesty\n" +
                    "Don't circle the track\n" +
                    "Just break the cycle in half\n" +
                    "And leave your skin on the floor\n" +
                    "\n" +
                    "Don't you shy away (Ah-ah-ah)\n" +
                    "Manifest a ceiling\n" +
                    "When you shy away (Ah-ah-ah)\n" +
                    "Searchin' for that feelin'\n" +
                    "Just like an \"I love you\" (Ooh, ooh)\n" +
                    "That isn't words (Ooh, ooh)\n" +
                    "Like a song he wrote (Ah-ah-ah)\n" +
                    "That's never heard\n" +
                    "\n" +
                    "That's never heard (Ah-ah-ah, ah-ah-ah)\n" +
                    "\n" +
                    "An \"I love you\"\n" +
                    "That isn't words\n" +
                    "Like a song he wrote\n" +
                    "That's never heard\n" +
                    "\n" +
                    "Don't you shy away",
            "I'm taking over my body\n" +
                    "Back in control, no more shotty\n" +
                    "I bet a lot of me was lost\n" +
                    "\"T\"'s uncrossed and \"I\"'s undotted\n" +
                    "I fought it a lot and it seems a lot\n" +
                    "Like flesh is all I got\n" +
                    "Not any more, flesh out the door, SWAT\n" +
                    "\n" +
                    "I must'a forgot, you can't trust me\n" +
                    "I'm open a moment and closed when you show it\n" +
                    "Before you know it I'm lost at sea\n" +
                    "And now that I write and think about it\n" +
                    "And the story unfolds\n" +
                    "You should take my life\n" +
                    "You should take my soul\n" +
                    "\n" +
                    "Ah ah ah\n" +
                    "Ah ah ah\n" +
                    "Ah ah ah\n" +
                    "Ah ah ah\n" +
                    "\n" +
                    "You are surrounding all my surroundings\n" +
                    "Sounding down the mountain range\n" +
                    "Of my left-side brain\n" +
                    "You are surrounding all my surroundings\n" +
                    "Twisting the kaleidoscope\n" +
                    "Behind both of my eyes\n" +
                    "\n" +
                    "Ah ah ah\n" +
                    "Ah ah ah (and I'll be holding on to you)\n" +
                    "Ah ah ah\n" +
                    "Ah ah ah (and I'll be holding on to you)\n" +
                    "\n" +
                    "Remember the moment\n" +
                    "You know exactly where you're goin'\n" +
                    "'Cause the next moment before you know it\n" +
                    "Time is slowin' and it's rolling still\n" +
                    "And the windowsill looks really nice, right?\n" +
                    "You think twice about your life\n" +
                    "It probably happens at night, right?\n" +
                    "\n" +
                    "Fight it, take the pain, ignite it\n" +
                    "Tie a noose around your mind\n" +
                    "Loose enough to breath fine and tie it\n" +
                    "To a tree tell it, you belong to me, this ain't a noose\n" +
                    "This is a leash and I have news for you\n" +
                    "You must obey me\n" +
                    "\n" +
                    "You are surrounding all my surroundings\n" +
                    "Sounding down the mountain range\n" +
                    "Of my left-side brain\n" +
                    "You are surrounding all my surroundings\n" +
                    "Twisting the kaleidoscope\n" +
                    "Behind both of my eyes\n" +
                    "\n" +
                    "Entertain my faith\n" +
                    "Entertain my faith\n" +
                    "Entertain my faith\n" +
                    "Entertain my faith\n" +
                    "Entertain my faith\n" +
                    "Entertain my faith\n" +
                    "Entertain my faith\n" +
                    "Entertain my faith\n" +
                    "Entertain my faith\n" +
                    "Entertain my faith\n" +
                    "\n" +
                    "Lean with it, rock with it\n" +
                    "When we gonna stop with it?\n" +
                    "Lyrics that mean nothing\n" +
                    "We were gifted with thought\n" +
                    "\n" +
                    "Is it time to move our feet\n" +
                    "To an introspective beat\n" +
                    "It ain't the speakers that bump hard\n" +
                    "It's our hearts that make the beat\n" +
                    "\n" +
                    "Lean with it, rock with it\n" +
                    "When we gonna stop with it?\n" +
                    "Lyrics that mean nothing\n" +
                    "We were gifted with thought\n" +
                    "\n" +
                    "Is it time to move our feet\n" +
                    "To an introspective beat\n" +
                    "It ain't the speakers that bump hard\n" +
                    "It's our hearts that make the beat\n" +
                    "\n" +
                    "Lean with it, rock with it\n" +
                    "When we gonna stop with it?\n" +
                    "Lyrics that mean nothing\n" +
                    "We were gifted with thought\n" +
                    "\n" +
                    "Is it time to move our feet\n" +
                    "To an introspective beat\n" +
                    "It ain't the speakers that bump hard\n" +
                    "It's our hearts that make the beat\n" +
                    "\n" +
                    "Lean with it, rock with it\n" +
                    "When we gonna stop with it?\n" +
                    "Lyrics that mean nothing\n" +
                    "We were gifted with thought\n" +
                    "Is it time to move our feet\n" +
                    "To an introspective beat\n" +
                    "It ain't the speakers that bump hard\n" +
                    "It's our hearts that make the beat\n" +
                    "\n" +
                    "Ah ah ah\n" +
                    "Ah ah ah (and I'll be holding on to you)\n" +
                    "Ah ah ah (and I'll be holding on to you)\n" +
                    "Ah ah ah (and I'll be holding on to you)\n" +
                    "And I'll be holding on to you\n" +
                    "\n" +
                    "Ah ah ah\n" +
                    "Ah ah ah (and I'll be holding on to you)\n" +
                    "Ah ah ah (and I'll be holding on to you)\n" +
                    "Ah ah ah (and I'll be holding on to you)\n" +
                    "And I'll be holding on to you\n" +
                    "And I'll be holding on to you",
            "I just wanna stay in the sun, where I find\n" +
                    "I know it's hard sometimes\n" +
                    "Pieces of peace in the sun's peace of mind\n" +
                    "I know it's hard sometimes\n" +
                    "Yeah, I think about the end just way too much\n" +
                    "But it's fun to fantasize\n" +
                    "On my enemies who wouldn't wish who I was\n" +
                    "But it's fun to fantasize\n" +
                    "\n" +
                    "Oh-ooh-oh-ooh-oh-ooh\n" +
                    "Oh-ooh-oh-ooh-oh-ooh\n" +
                    "I'm fallin', so I'm takin' my time on my ride\n" +
                    "Oh-ooh-oh-ooh-oh\n" +
                    "I'm fallin', so I'm takin' my time on my ride\n" +
                    "Takin' my time on my ride\n" +
                    "\n" +
                    "\"I'd die for you,\" that's easy to say\n" +
                    "We have a list of people that we would take\n" +
                    "A bullet for them, a bullet for you\n" +
                    "A bullet for everybody in this room\n" +
                    "But I don't seem to see many bullets comin' through\n" +
                    "See many bullets comin' through\n" +
                    "Metaphorically, I'm the man\n" +
                    "But literally, I don't know what I'd do\n" +
                    "\"I'd live for you,\" and that's hard to do\n" +
                    "Even harder to say when you know it's not true\n" +
                    "Even harder to write when you know that tonight\n" +
                    "There were people back home who tried talking to you\n" +
                    "But then you ignored them, still\n" +
                    "All these questions, they're for real\n" +
                    "Like, \"Who would you live for?\"\n" +
                    "\"Who would you die for?\"\n" +
                    "And, \"Would you ever kill?\"\n" +
                    "\n" +
                    "Oh-ooh-oh-ooh-oh-ooh\n" +
                    "Oh-ooh-oh-ooh-oh-ooh\n" +
                    "I'm fallin', so I'm takin' my time on my ride\n" +
                    "Oh-ooh-oh-ooh-oh\n" +
                    "I'm fallin', so I'm takin' my time on my ride\n" +
                    "Takin' my time on my ride\n" +
                    "\n" +
                    "I've been thinkin' too much\n" +
                    "I've been thinkin' too much\n" +
                    "I've been thinkin' too much\n" +
                    "I've been thinkin' too much\n" +
                    "Help me\n" +
                    "I've been thinkin' too much (I've been thinkin' too much)\n" +
                    "I've been thinkin' too much (Help me)\n" +
                    "I've been thinkin' too much (I've been thinkin' too much)\n" +
                    "I've been thinkin' too much\n" +
                    "\n" +
                    "Oh-ooh-oh-ooh-oh-ooh\n" +
                    "Oh-ooh-oh-ooh-oh-ooh\n" +
                    "I'm fallin', so I'm takin' my time on my ride\n" +
                    "Oh-ooh-oh-ooh-oh\n" +
                    "I'm fallin', so I'm takin' my time on my ride\n" +
                    "Takin' my time on my ride\n" +
                    "\n" +
                    "Oh-ooh-oh-ooh-oh-ooh\n" +
                    "Oh-ooh-oh-ooh-oh-ooh\n" +
                    "I'm fallin', so I'm takin' my time on my ride\n" +
                    "Oh-ooh-oh-ooh-oh\n" +
                    "I'm fallin', so I'm takin' my time on my\n" +
                    "\n" +
                    "I've been thinkin' too much\n" +
                    "Help me\n" +
                    "I've been thinkin' too much\n" +
                    "Help me\n" +
                    "(I've been thinkin' too much)\n" +
                    "I've been thinkin' too much\n" +
                    "(I've been thinkin' too much)\n" +
                    "Help me\n" +
                    "(I've been thinkin' too much)\n" +
                    "I've been thinkin' too much\n" +
                    "(I've been thinkin' too much)\n" +
                    "Help me",
            "Slow down on Monday\n" +
                    "Not a sound on Wednesday, yeah\n" +
                    "Might get loud (Ayy) on Friday\n" +
                    "But on Saturday, Saturday, Saturday\n" +
                    "We paint the town\n" +
                    "\n" +
                    "Lose my sense a time or two\n" +
                    "Weeks feel like days\n" +
                    "Medicate in the afternoon\n" +
                    "And I just want to know\n" +
                    "Have you lost your footing, too?\n" +
                    "I just pray that I'm not losing you\n" +
                    "\n" +
                    "Catch me floatin' circles in my fish bowl\n" +
                    "Keep things fresh\n" +
                    "She said that I should change my clothes\n" +
                    "I exaggerate the life we used to know, oh, oh\n" +
                    "\n" +
                    "Slow down on Monday\n" +
                    "Not a sound on Wednesday, yeah\n" +
                    "Might get loud (Ayy) on Friday\n" +
                    "But on Saturday, Saturday, Saturday\n" +
                    "We paint the town\n" +
                    "\n" +
                    "Ooh, you're good\n" +
                    "These are my dancin' shoes\n" +
                    "We paint the town\n" +
                    "Ooh, you're good\n" +
                    "Thought I would dance with you\n" +
                    "Might get loud on Friday\n" +
                    "But on Saturday, Saturday, Saturday\n" +
                    "We paint the town\n" +
                    "\n" +
                    "(Feelin' great)\n" +
                    "Life moves slow on the ocean floor\n" +
                    "(Feelin' great)\n" +
                    "I can't feel the waves anymore\n" +
                    "Did the tide forget to move?\n" +
                    "I just pray that I'm not losin' you\n" +
                    "\n" +
                    "Catch me floatin' circles in my fish bowl\n" +
                    "Keep things fresh\n" +
                    "She said that I should change my clothes\n" +
                    "I exaggerate the life we used to know, oh, yeah\n" +
                    "\n" +
                    "[Interlude: Tyler Joseph & Jenna Joseph]\n" +
                    "Workin' on music?\n" +
                    "Yeah\n" +
                    "I, I'll just go to bed, I'm tired\n" +
                    "I wanna watch Friends with you\n" +
                    "Oh, if you feel like you have time to do a song or you're inspired\n" +
                    "You should just go for it\n" +
                    "\n" +
                    "(Oh), Slow down on Monday (Yeah, yeah)\n" +
                    "Not a sound on Wednesday\n" +
                    "Might get loud on Friday\n" +
                    "But on Saturday, Saturday, Saturday\n" +
                    "We paint the town\n" +
                    "\n" +
                    "(Da-da-da-da-da-da-da-da)\n" +
                    "(We paint the, on)\n" +
                    "Might get loud on Friday\n" +
                    "But on Saturday, Saturday, Saturday.",
            "I ponder of something great\n" +
                    "My lungs will fill and then deflate\n" +
                    "They fill with fire, exhale desire\n" +
                    "I know it's dire my time today\n" +
                    "\n" +
                    "I have these thoughts, so often I ought\n" +
                    "To replace that slot with what I once bought\n" +
                    "'Cause somebody stole my car radio\n" +
                    "And now I just sit in silence\n" +
                    "\n" +
                    "Sometimes quiet is violent\n" +
                    "I find it hard to hide it\n" +
                    "My pride is no longer inside\n" +
                    "It's on my sleeve\n" +
                    "My skin will scream reminding me of\n" +
                    "Who I killed inside my dream\n" +
                    "I hate this car that I'm driving\n" +
                    "There's no hiding for me\n" +
                    "I'm forced to deal with what I feel\n" +
                    "There is no distraction to mask what is real\n" +
                    "I could pull the steering wheel\n" +
                    "\n" +
                    "I have these thoughts, so often I ought\n" +
                    "To replace that slot with what I once bought\n" +
                    "'Cause somebody stole my car radio\n" +
                    "And now I just sit in silence\n" +
                    "\n" +
                    "I ponder of something terrifying\n" +
                    "'Cause this time there's no sound to hide behind\n" +
                    "I find over the course of our human existence\n" +
                    "One thing consists of consistence\n" +
                    "And it's that we're all battling fear\n" +
                    "Oh dear, I don't know if we know why we're here\n" +
                    "Oh my, too deep, please stop thinking\n" +
                    "I liked it better when my car had sound\n" +
                    "\n" +
                    "There are things we can do\n" +
                    "But from the things that work there are only two\n" +
                    "And from the two that we choose to do\n" +
                    "Peace will win and fear will lose\n" +
                    "There's faith and there's sleep\n" +
                    "We need to pick one please because\n" +
                    "Faith is to be awake\n" +
                    "And to be awake is for us to think\n" +
                    "And for us to think is to be alive\n" +
                    "And I will try with every rhyme\n" +
                    "To come across like I am dying\n" +
                    "To let you know you need to try to think\n" +
                    "\n" +
                    "I have these thoughts, so often I ought\n" +
                    "To replace that slot with what I once bought\n" +
                    "'Cause somebody stole my car radio\n" +
                    "And now I just sit in silence\n" +
                    "\n" +
                    "And now I just sit in silence\n" +
                    "And now I just sit\n" +
                    "And now I just sit in silence\n" +
                    "And now I just sit in silence\n" +
                    "And now I just sit in silence\n" +
                    "And now I just sit\n" +
                    "\n" +
                    "I ponder of something great\n" +
                    "My lungs will fill and then deflate\n" +
                    "They fill with fire, exhale desire\n" +
                    "I know it's dire my time today\n" +
                    "\n" +
                    "I have these thoughts, so often I ought\n" +
                    "To replace that slot with what I once bought\n" +
                    "'Cause somebody stole my car radio\n" +
                    "And now I just sit in silence",
            "TSo where are you? It's been a little while\n" +
                    "\n" +
                    "Sippin' on straight chlorine, let the vibes slide over me\n" +
                    "This beat is a chemical, beat is a chemical\n" +
                    "When I leave don't save my seat, I'll be back when it's all complete\n" +
                    "The moment is medical, moment is medical\n" +
                    "Sippin' on straight chlorine\n" +
                    "\n" +
                    "Lovin' what I'm tastin'\n" +
                    "Venom on my tongue\n" +
                    "Dependant at times\n" +
                    "Poisonous vibration\n" +
                    "Help my body run\n" +
                    "\n" +
                    "I'm runnin' for my li-i-i-i-i-i-fe\n" +
                    "Runnin' for my li-i-i-i-i-i-fe\n" +
                    "\n" +
                    "Sippin' on straight chlorine, let the vibes slide over me\n" +
                    "This beat is a chemical, beat is a chemical\n" +
                    "When I leave don't save my seat, I'll be back when it's all complete\n" +
                    "The moment is medical, moment is medical\n" +
                    "Sippin' on straight chlorine\n" +
                    "\n" +
                    "Fall out of formation\n" +
                    "I plan my escape from walls they confined\n" +
                    "Rebel red carnation\n" +
                    "Grows while I decay\n" +
                    "\n" +
                    "I'm runnin' for my li-i-i-i-i-i-fe\n" +
                    "Runnin' for my li-i-i-i-i-i-fe\n" +
                    "Yeah, I'm runnin' for my li-i-i-i-i-i-fe\n" +
                    "Runnin' for my li-i-i-i-i-i-fe\n" +
                    "\n" +
                    "Had you in my coat pocket, where I kept my rebel red\n" +
                    "I felt I was invincible, you wrapped around my head\n" +
                    "Now different lives I lead, my body lives on lead\n" +
                    "The last two line may read incorrect until said\n" +
                    "The lead is terrible in flavour\n" +
                    "But now you double as a papermaker\n" +
                    "I despise you sometimes\n" +
                    "I love to hate the fight and you in my life is like\n" +
                    "\n" +
                    "Sippin' on straight chlorine, let the vibes slide over me\n" +
                    "This beat is a chemical, beat is a chemical\n" +
                    "When I leave don't save my seat, I'll be back when it's all complete\n" +
                    "The moment is medical, moment is medical\n" +
                    "Sippin' on straight chlorine\n" +
                    "\n" +
                    "Let the vibe, let the vibe\n" +
                    "Let the vibe, let the vibe\n" +
                    "Beat is a chemical\n" +
                    "Let the vibe, let the vibe\n" +
                    "Let the vibe, let the vibe\n" +
                    "Moment is medical\n" +
                    "Sippin' on straight chlorine\n" +
                    "Let the vibe, let the vibe\n" +
                    "Let the vibe, let the vibe\n" +
                    "Beat is a chemical\n" +
                    "Let the vibe, let the vibe\n" +
                    "Let the vibe, let the vibe\n" +
                    "Moment is medical\n" +
                    "Sippin' on straight chlorine\n" +
                    "\n" +
                    "I'm so sorry, I forgot you\n" +
                    "Let me catch you up to speed\n" +
                    "I've been tested like the end of\n" +
                    "A weathered flag that's by the sea\n" +
                    "\n" +
                    "Can you build my house with pieces?\n" +
                    "I'm just a chemical\n" +
                    "Can you build my house with pieces?\n" +
                    "I'm just a chemical\n" +
                    "Can you build my house with pieces?\n" +
                    "I'm just a chemical\n" +
                    "Can you build my house with pieces?\n" +
                    "I'm just a chemical"
    };

    private static int[] musicImages = {
            R.drawable.blurryface,
            R.drawable.sai,
            R.drawable.trench,
            R.drawable.blurryface,
            R.drawable.sai,
            R.drawable.vessel,
            R.drawable.blurryface,
            R.drawable.sai,
            R.drawable.vessel,
            R.drawable.trench
    };

    static ArrayList<Music> getListData() {
        ArrayList<Music> list = new ArrayList<>();
        for (int position = 0; position < musicNames.length; position++) {
            Music music = new Music();
            music.setTitle(musicNames[position]);
            music.setLyric(musicLyric[position]);
            music.setImage(musicImages[position]);
            list.add(music);
        }
        return list;
    }
}