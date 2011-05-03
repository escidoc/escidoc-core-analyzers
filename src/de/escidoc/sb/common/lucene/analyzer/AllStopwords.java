/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
 *
 * You can obtain a copy of the license at license/ESCIDOC.LICENSE
 * or http://www.escidoc.de/license.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at license/ESCIDOC.LICENSE.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright 2006-2007 Fachinformationszentrum Karlsruhe Gesellschaft
 * für wissenschaftlich-technische Information mbH and Max-Planck-
 * Gesellschaft zur Förderung der Wissenschaft e.V.  
 * All rights reserved.  Use is subject to license terms.
 */

package de.escidoc.sb.common.lucene.analyzer;

/**
 * Class holds all Stopwords that have to get filtered in 
 * language-independant index in a String-Array.
 * 
 * @author MIH
 * @sb
 */
public class AllStopwords {
    public static final String[] ALL_STOP_WORDS =
    	//Taken from german stopwords
        { "a", "ab", "aber", "aber", "ach", "acht", "achte", "achten",
            "achter", "achtes", "ag", "alle", "allein", "allem", "allen",
            "aller", "allerdings", "alles", "allgemeinen", "als", "als",
            "also", "am", "an", "andere", "anderen", "andern", "anders", "au",
            "auch", "auch", "auf", "aus", "ausser", "außer", "ausserdem",
            "außerdem", "b", "bald", "bei", "beide", "beiden", "beim",
            "beispiel", "bekannt", "bereits", "besonders", "besser", "besten",
            "bin", "bis", "bisher", "bist", "c", "d", "da", "dabei", "dadurch",
            "dafür", "dagegen", "daher", "dahin", "dahinter", "damals",
            "damit", "danach", "daneben", "dank", "dann", "daran", "darauf",
            "daraus", "darf", "darfst", "darin", "darüber", "darum",
            "darunter", "das", "das", "dasein", "daselbst", "dass", "daß",
            "dasselbe", "davon", "davor", "dazu", "dazwischen", "dein",
            "deine", "deinem", "deiner", "dem", "dementsprechend",
            "demgegenüber", "demgemäss", "demgemäß", "demselben",
            "demzufolge", "den", "denen", "denn", "denn", "denselben", "der",
            "deren", "derjenige", "derjenigen", "dermassen", "dermaßen",
            "derselbe", "derselben", "des", "deshalb", "desselben", "dessen",
            "deswegen", "d.h", "dich", "die", "diejenige", "diejenigen",
            "dies", "diese", "dieselbe", "dieselben", "diesem", "diesen",
            "dieser", "dieses", "dir", "doch", "dort", "drei", "drin",
            "dritte", "dritten", "dritter", "drittes", "du", "durch",
            "durchaus", "dürfen", "dürft", "durfte", "durften", "e", "eben",
            "ebenso", "ehrlich", "ei", "ei,", "ei,", "eigen", "eigene",
            "eigenen", "eigener", "eigenes", "ein", "einander", "eine",
            "einem", "einen", "einer", "eines", "einige", "einigen", "einiger",
            "einiges", "einmal", "einmal", "eins", "elf", "en", "ende",
            "endlich", "entweder", "entweder", "er", "Ernst", "erst", "erste",
            "ersten", "erster", "erstes", "es", "etwa", "etwas", "euch", "f",
            "früher", "fünf", "fünfte", "fünften", "fünfter", "fünftes",
            "für", "g", "gab", "ganz", "ganze", "ganzen", "ganzer", "ganzes",
            "gar", "gedurft", "gegen", "gegenüber", "gehabt", "gehen", "geht",
            "gekannt", "gekonnt", "gemacht", "gemocht", "gemusst", "genug",
            "gerade", "gern", "gesagt", "gesagt", "geschweige", "gewesen",
            "gewollt", "geworden", "gibt", "ging", "gleich", "gott", "gross",
            "groß", "grosse", "große", "grossen", "großen", "grosser",
            "großer", "grosses", "großes", "gut", "gute", "guter", "gutes",
            "h", "habe", "haben", "habt", "hast", "hat", "hatte", "hätte",
            "hatten", "hätten", "heisst", "her", "heute", "hier", "hin",
            "hinter", "hoch", "i", "ich", "ihm", "ihn", "ihnen", "ihr", "ihre",
            "ihrem", "ihren", "ihrer", "ihres", "im", "im", "immer", "in",
            "in", "indem", "infolgedessen", "ins", "irgend", "ist", "j", "ja",
            "ja", "jahr", "jahre", "jahren", "je", "jede", "jedem", "jeden",
            "jeder", "jedermann", "jedermanns", "jedoch", "jemand", "jemandem",
            "jemanden", "jene", "jenem", "jenen", "jener", "jenes", "jetzt",
            "k", "kam", "kann", "kannst", "kaum", "kein", "keine", "keinem",
            "keinen", "keiner", "kleine", "kleinen", "kleiner", "kleines",
            "kommen", "kommt", "können", "könnt", "konnte", "könnte",
            "konnten", "kurz", "l", "lang", "lange", "lange", "leicht",
            "leide", "lieber", "los", "m", "machen", "macht", "machte", "mag",
            "magst", "mahn", "man", "manche", "manchem", "manchen", "mancher",
            "manches", "mann", "mehr", "mein", "meine", "meinem", "meinen",
            "meiner", "meines", "mensch", "menschen", "mich", "mir", "mit",
            "mittel", "mochte", "möchte", "mochten", "mögen", "möglich",
            "mögliche", "möglichen", "mögliches", "möglichst", "mögt",
            "morgen", "muss", "muß", "mßssen", "musst", "mßsst", "musste",
            "mussten", "n", "na", "nach", "nachdem", "nahm", "natürlich",
            "neben", "nein", "neue", "neuen", "neun", "neunte", "neunten",
            "neunter", "neuntes", "nicht", "nicht", "nichts", "nie", "niemand",
            "niemandem", "niemanden", "noch", "nun", "nun", "nur", "o", "ob",
            "ob", "oben", "oder", "oder", "offen", "oft", "oft", "ohne",
            "Ordnung", "p", "q", "r", "recht", "rechte", "rechten", "rechter",
            "rechtes", "richtig", "rund", "s", "sa", "sache", "sagt", "sagte",
            "sah", "satt", "schlecht", "Schluss", "schon", "sechs", "sechste",
            "sechsten", "sechster", "sechstes", "sehr", "sei", "sei", "seid",
            "seien", "sein", "seine", "seinem", "seinen", "seiner", "seines",
            "seit", "seitdem", "selbst", "selbst", "sich", "sie", "sieben",
            "siebente", "siebenten", "siebenter", "siebentes", "sind", "so",
            "solang", "solche", "solchem", "solchen", "solcher", "solches",
            "soll", "sollen", "sollte", "sollten", "sondern", "sonst", "sowie",
            "später", "statt", "t", "tag", "tage", "tagen", "tat", "teil",
            "tel", "tritt", "trotzdem", "tun", "u", "über", "überhaupt",
            "übrigens", "uhr", "um", "und", "und?", "uns", "unser", "unsere",
            "unserer", "unter", "v", "vergangenen", "viel", "viele", "vielem",
            "vielen", "vielleicht", "vier", "vierte", "vierten", "vierter",
            "viertes", "vom", "von", "vor", "w", "wahr?", "während",
            "währenddem", "währenddessen", "wann", "war", "wäre", "waren",
            "wart", "warum", "was", "wegen", "weil", "weit", "weiter",
            "weitere", "weiteren", "weiteres", "welche", "welchem", "welchen",
            "welcher", "welches", "wem", "wen", "wenig", "wenig", "wenige",
            "weniger", "weniges", "wenigstens", "wenn", "wenn", "wer", "werde",
            "werden", "werden,", "werden.", "werdend", "werdende", "werdenden",
            "werdendes", "werdet", "wessen", "wie", "wie", "wieder", "will",
            "willst", "wir", "wird", "wirklich", "wirst", "wo", "wohl",
            "wollen", "wollt", "wollte", "wollten", "worden", "wurde",
            "würde", "wurden", "würden", "x", "y", "z", "z.b", "zehn",
            "zehnte", "zehnten", "zehnter", "zehntes", "zeit", "zu", "zuerst",
            "zugleich", "zum", "zum", "zunächst", "zur", "zurück",
            "zusammen", "zwanzig", "zwar", "zwar", "zwei", "zweite", "zweiten",
            "zweiter", "zweites", "zwischen", "zwölf", 
            //taken from english stopwords
            "a", "a's", "able", "about", "above", "according", "accordingly",
            "across", "actually", "after", "afterwards", "again", "against",
            "ain't", "all", "allow", "allows", "almost", "alone", "along",
            "already", "also", "although", "always", "am", "among", "amongst",
            "an", "and", "another", "any", "anybody", "anyhow", "anyone",
            "anything", "anyway", "anyways", "anywhere", "apart", "appear",
            "appreciate", "appropriate", "are", "aren't", "around", "as",
            "aside", "ask", "asking", "associated", "at", "available", "away",
            "awfully", "b", "be", "became", "because", "become", "becomes",
            "becoming", "been", "before", "beforehand", "behind", "being",
            "believe", "below", "beside", "besides", "best", "better",
            "between", "beyond", "both", "brief", "but", "by", "c", "c'mon",
            "c's", "came", "can", "can't", "cannot", "cant", "cause", "causes",
            "certain", "certainly", "changes", "clearly", "co", "com", "come",
            "comes", "concerning", "consequently", "consider", "considering",
            "contain", "containing", "contains", "corresponding", "could",
            "couldn't", "course", "currently", "d", "definitely", "described",
            "despite", "did", "didn't", "different", "do", "does", "doesn't",
            "doing", "don't", "done", "down", "downwards", "during", "e",
            "each", "edu", "eg", "eight", "either", "else", "elsewhere",
            "enough", "entirely", "especially", "et", "etc", "even", "ever",
            "every", "everybody", "everyone", "everything", "everywhere", "ex",
            "exactly", "example", "except", "f", "far", "few", "fifth",
            "first", "five", "followed", "following", "follows", "for",
            "former", "formerly", "forth", "four", "from", "further",
            "furthermore", "g", "get", "gets", "getting", "given", "gives",
            "go", "goes", "going", "gone", "got", "gotten", "greetings", "h",
            "had", "hadn't", "happens", "hardly", "has", "hasn't", "have",
            "haven't", "having", "he", "he's", "hello", "help", "hence", "her",
            "here", "here's", "hereafter", "hereby", "herein", "hereupon",
            "hers", "herself", "hi", "him", "himself", "his", "hither",
            "hopefully", "how", "howbeit", "however", "i", "i'd", "i'll",
            "i'm", "i've", "ie", "if", "ignored", "immediate", "in",
            "inasmuch", "inc", "indeed", "indicate", "indicated", "indicates",
            "inner", "insofar", "instead", "into", "inward", "is", "isn't",
            "it", "it'd", "it'll", "it's", "its", "itself", "j", "just", "k",
            "keep", "keeps", "kept", "know", "knows", "known", "l", "last",
            "lately", "later", "latter", "latterly", "least", "less", "lest",
            "let", "let's", "like", "liked", "likely", "little", "look",
            "looking", "looks", "ltd", "m", "mainly", "many", "may", "maybe",
            "me", "mean", "meanwhile", "merely", "might", "more", "moreover",
            "most", "mostly", "much", "must", "my", "myself", "n", "name",
            "namely", "nd", "near", "nearly", "necessary", "need", "needs",
            "neither", "never", "nevertheless", "new", "next", "nine", "no",
            "nobody", "non", "none", "noone", "nor", "normally", "not",
            "nothing", "novel", "now", "nowhere", "o", "obviously", "of",
            "off", "often", "oh", "ok", "okay", "old", "on", "once", "one",
            "ones", "only", "onto", "or", "other", "others", "otherwise",
            "ought", "our", "ours", "ourselves", "out", "outside", "over",
            "overall", "own", "p", "particular", "particularly", "per",
            "perhaps", "placed", "please", "plus", "possible", "presumably",
            "probably", "provides", "q", "que", "quite", "qv", "r", "rather",
            "rd", "re", "really", "reasonably", "regarding", "regardless",
            "regards", "relatively", "respectively", "right", "s", "said",
            "same", "saw", "say", "saying", "says", "second", "secondly",
            "see", "seeing", "seem", "seemed", "seeming", "seems", "seen",
            "self", "selves", "sensible", "sent", "serious", "seriously",
            "seven", "several", "shall", "she", "should", "shouldn't", "since",
            "six", "so", "some", "somebody", "somehow", "someone", "something",
            "sometime", "sometimes", "somewhat", "somewhere", "soon", "sorry",
            "specified", "specify", "specifying", "still", "sub", "such",
            "sup", "sure", "t", "t's", "take", "taken", "tell", "tends", "th",
            "than", "thank", "thanks", "thanx", "that", "that's", "thats",
            "the", "their", "theirs", "them", "themselves", "then", "thence",
            "there", "there's", "thereafter", "thereby", "therefore",
            "therein", "theres", "thereupon", "these", "they", "they'd",
            "they'll", "they're", "they've", "think", "third", "this",
            "thorough", "thoroughly", "those", "though", "three", "through",
            "throughout", "thru", "thus", "to", "together", "too", "took",
            "toward", "towards", "tried", "tries", "truly", "try", "trying",
            "twice", "two", "u", "un", "under", "unfortunately", "unless",
            "unlikely", "until", "unto", "up", "upon", "us", "use", "used",
            "useful", "uses", "using", "usually", "uucp", "v", "value",
            "various", "very", "via", "viz", "vs", "w", "want", "wants", "was",
            "wasn't", "way", "we", "we'd", "we'll", "we're", "we've",
            "welcome", "well", "went", "were", "weren't", "what", "what's",
            "whatever", "when", "whence", "whenever", "where", "where's",
            "whereafter", "whereas", "whereby", "wherein", "whereupon",
            "wherever", "whether", "which", "while", "whither", "who", "who's",
            "whoever", "whole", "whom", "whose", "why", "will", "willing",
            "wish", "with", "within", "without", "won't", "wonder", "would",
            "would", "wouldn't", "x", "y", "yes", "yet", "you", "you'd",
            "you'll", "you're", "you've", "your", "yours", "yourself",
            "yourselves", "z", "zero"
        	};

}
