package com.ConditionalStatements;

import java.util.Scanner;

public class RestaurantOrderInvoice {

	public static void main(String[] args) {
		System.out.println("**********WELCOME TO VCUBE RESTAURANT**********");

		Scanner sc = new Scanner(System.in);
		String yn = "";
		double grand_total = 0;

		do {
			System.out.println("Enter the catagory like Starters/Veg/Non-Veg/Drinks/Deserts");
			String catagory = sc.next();

			switch (catagory) {
			case "Starters" -> {
				String syn;
				double starters_total = 0;
				do {
					System.out.println("Enter the Starter-Items:");
					String starter_item = sc.next();

					switch (starter_item) {
					case "c65" -> {
						System.out.println("Chicken65 ->Price:₹200");
						double c65_price = 200;
						starters_total += c65_price;
					}
					case "chilli_chicken" -> {
						System.out.println("Chilli Chicken -> Price: ₹220");
						double chilli_chicken_price = 220;
						starters_total += chilli_chicken_price;
					}

					case "chicken_manchurian" -> {
						System.out.println("Chicken Manchurian -> Price: ₹230");
						double chicken_manchurian_price = 230;
						starters_total += chicken_manchurian_price;
					}

					case "chicken_tikka" -> {
						System.out.println("Chicken Tikka -> Price: ₹250");
						double chicken_tikka_price = 250;
						starters_total += chicken_tikka_price;
					}

					case "tandoori_chicken" -> {
						System.out.println("Tandoori Chicken -> Price: ₹300");
						double tandoori_chicken_price = 300;
						starters_total += tandoori_chicken_price;
					}

					case "chicken_lollipop" -> {
						System.out.println("Chicken Lollipop -> Price: ₹240");
						double chicken_lollipop_price = 240;
						starters_total += chicken_lollipop_price;
					}

					case "pepper_chicken" -> {
						System.out.println("Pepper Chicken -> Price: ₹230");
						double pepper_chicken_price = 230;
						starters_total += pepper_chicken_price;
					}

					case "garlic_chicken" -> {
						System.out.println("Garlic Chicken -> Price: ₹220");
						double garlic_chicken_price = 220;
						starters_total += garlic_chicken_price;
					}

					case "apollo_fish" -> {
						System.out.println("Apollo Fish -> Price: ₹280");
						double apollo_fish_price = 280;
						starters_total += apollo_fish_price;
					}

					case "prawns_fry" -> {
						System.out.println("Prawns Fry -> Price: ₹300");
						double prawns_fry_price = 300;
						starters_total += prawns_fry_price;
					}

					case "fish_fry" -> {
						System.out.println("Fish Fry -> Price: ₹250");
						double fish_fry_price = 250;
						starters_total += fish_fry_price;
					}
					default -> System.out.println("Entered Starter Item is Not Available");

					}
					System.out.println("Do You Want to Continue With the Starter Items..? Click Y for Yes N for No");
					syn = sc.next();
				} while (syn.equalsIgnoreCase("y"));
				System.out.println("Straters Total: " + starters_total);
				grand_total += starters_total;

			}
			case "Veg" -> {
				String vyn;
				double veg_total = 0;
				do {
					System.out.println("Enter the Veg-Items:");
					String veg_item = sc.next();
					switch (veg_item) {
					case "ptm" -> {
						System.out.println("Paneer Tikka Masala ->Price is ₹200");
						double ptm_price = 200;
						veg_total += ptm_price;
					}

					case "pbm" -> {
						System.out.println("Paneer Butter Masala -> Price is ₹220");
						double pbm_price = 220;
						veg_total += pbm_price;
					}

					case "vc" -> {
						System.out.println("Veg Curry -> Price is ₹150");
						double vc_price = 150;
						veg_total += vc_price;
					}

					case "dal" -> {
						System.out.println("Dal Tadka -> Price is ₹120");
						double dal_price = 120;
						veg_total += dal_price;
					}

					case "palak" -> {
						System.out.println("Palak Paneer -> Price is ₹180");
						double palak_price = 180;
						veg_total += palak_price;
					}

					case "chole" -> {
						System.out.println("Chole Masala -> Price is ₹140");
						double chole_price = 140;
						veg_total += chole_price;
					}

					case "mixveg" -> {
						System.out.println("Mix Veg Curry -> Price is ₹160");
						double mixveg_price = 160;
						veg_total += mixveg_price;
					}

					case "mushroom" -> {
						System.out.println("Mushroom Masala -> Price is ₹190");
						double mushroom_price = 190;
						veg_total += mushroom_price;
					}

					case "kadai" -> {
						System.out.println("Kadai Paneer -> Price is ₹210");
						double kadai_price = 210;
						veg_total += kadai_price;
					}

					case "veg_biryani" -> {
						System.out.println("Veg Biryani -> Price is ₹170");
						double veg_biryani_price = 170;
						veg_total += veg_biryani_price;
					}

					default -> System.out.println("Entered Veg Item is Not Available");
					}
					System.out.println("Do you Want to Continue With Items..? Click Y for Yes N for No");
					vyn = sc.next();
				} while (vyn.equalsIgnoreCase("y"));
				System.out.println("Veg Items Total:" + veg_total);
				grand_total += veg_total;

			}

			case "Non-Veg" -> {
				String nvyn;
				double non_veg_total = 0;

				do {
					System.out.println("Enter the Non-Veg Items:");
					String non_veg_item = sc.next();

					switch (non_veg_item) {
					case "cdb" -> {
						System.out.println("Chicken Dum Biriyani ->Price is ₹200 ");
						double cdb_price = 200;
						non_veg_total += cdb_price;
					}
					case "chicken_biryani" -> {
						System.out.println("Chicken Biryani -> Price is ₹220");
						double chicken_biryani_price = 220;
						non_veg_total += chicken_biryani_price;
					}

					case "mutton_biryani" -> {
						System.out.println("Mutton Biryani -> Price is ₹300");
						double mutton_biryani_price = 300;
						non_veg_total += mutton_biryani_price;
					}

					case "fish_biryani" -> {
						System.out.println("Fish Biryani -> Price is ₹250");
						double fish_biryani_price = 250;
						non_veg_total += fish_biryani_price;
					}

					case "prawns_biryani" -> {
						System.out.println("Prawns Biryani -> Price is ₹280");
						double prawns_biryani_price = 280;
						non_veg_total += prawns_biryani_price;
					}

					case "chicken_fried_rice" -> {
						System.out.println("Chicken Fried Rice -> Price is ₹180");
						double chicken_fried_rice_price = 180;
						non_veg_total += chicken_fried_rice_price;
					}

					case "egg_biryani" -> {
						System.out.println("Egg Biryani -> Price is ₹160");
						double egg_biryani_price = 160;
						non_veg_total += egg_biryani_price;
					}

					case "chicken_65_biryani" -> {
						System.out.println("Chicken 65 Biryani -> Price is ₹240");
						double chicken_65_biryani_price = 240;
						non_veg_total += chicken_65_biryani_price;
					}

					case "mutton_fried_rice" -> {
						System.out.println("Mutton Fried Rice -> Price is ₹260");
						double mutton_fried_rice_price = 260;
						non_veg_total += mutton_fried_rice_price;
					}

					case "chicken_pulao" -> {
						System.out.println("Chicken Pulao -> Price is ₹200");
						double chicken_pulao_price = 200;
						non_veg_total += chicken_pulao_price;
					}

					case "mixed_nonveg_biryani" -> {
						System.out.println("Mixed Non-Veg Biryani -> Price is ₹320");
						double mixed_nonveg_biryani_price = 320;
						non_veg_total += mixed_nonveg_biryani_price;
					}
					default -> System.out.println("Entered Non-Veg Item is Not Available");
					}
					System.out.println("Do You Want to continue with Non-Veg Items..? Click Y for Yes N for No");
					nvyn = sc.next();
				} while (nvyn.equalsIgnoreCase("y"));
				System.out.println("Non-Veg Items Total:" + non_veg_total);
				grand_total += non_veg_total;
			}

			case "Drinks" -> {
				String dyn;
				double drinks_total = 0;

				do {
					System.out.println("Enter the Drinks:");
					String drinks = sc.next();

					switch (drinks) {
					case "tu" -> {
						System.out.println("Thumbs Up ->Price is ₹30");
						double thumbsup_price = 30;
						drinks_total += thumbsup_price;
					}
					case "pepsi" -> {
						System.out.println("Pepsi -> Price is ₹30");
						double pepsi_price = 30;
						drinks_total += pepsi_price;
					}

					case "coke" -> {
						System.out.println("Coca-Cola -> Price is ₹35");
						double coke_price = 35;
						drinks_total += coke_price;
					}

					case "sprite" -> {
						System.out.println("Sprite -> Price is ₹30");
						double sprite_price = 30;
						drinks_total += sprite_price;
					}

					case "fanta" -> {
						System.out.println("Fanta -> Price is ₹30");
						double fanta_price = 30;
						drinks_total += fanta_price;
					}

					case "maaza" -> {
						System.out.println("Maaza -> Price is ₹25");
						double maaza_price = 25;
						drinks_total += maaza_price;
					}

					case "slice" -> {
						System.out.println("Slice -> Price is ₹25");
						double slice_price = 25;
						drinks_total += slice_price;
					}

					case "lemon_juice" -> {
						System.out.println("Lemon Juice -> Price is ₹40");
						double lemon_juice_price = 40;
						drinks_total += lemon_juice_price;
					}

					case "orange_juice" -> {
						System.out.println("Orange Juice -> Price is ₹50");
						double orange_juice_price = 50;
						drinks_total += orange_juice_price;
					}

					case "cold_coffee" -> {
						System.out.println("Cold Coffee -> Price is ₹60");
						double cold_coffee_price = 60;
						drinks_total += cold_coffee_price;
					}

					case "mineral_water" -> {
						System.out.println("Mineral Water -> Price is ₹20");
						double mineral_water_price = 20;
						drinks_total += mineral_water_price;
					}
					default -> System.out.println("Entered Drink is Not Available");
					}
					System.out.println("Do You Want to Continue With the Drinks..? Click Y for Yes N for No");
					dyn = sc.next();
				} while (dyn.equalsIgnoreCase("y"));
				System.out.println("Drinks Total:" + drinks_total);
				grand_total += drinks_total;
			}
			case "Deserts" -> {
				String dsyn;
				double deserts_total = 0;

				do {
					System.out.println("Enter the Deserts:");
					String deserts = sc.next();

					switch (deserts) {
					case "kkk" -> {
						System.out.println("Kaddu-ka-kheer ->Price is ₹150");
						double kkk_price = 150;
						deserts_total += kkk_price;
					}
					case "gulab_jamun" -> {
						System.out.println("Gulab Jamun -> Price is ₹80");
						double gulab_jamun_price = 80;
						deserts_total += gulab_jamun_price;
					}

					case "double_ka_meetha" -> {
						System.out.println("Double Ka Meetha -> Price is ₹120");
						double double_ka_meetha_price = 120;
						deserts_total += double_ka_meetha_price;
					}

					case "apricot_delight" -> {
						System.out.println("Apricot Delight -> Price is ₹150");
						double apricot_delight_price = 150;
						deserts_total += apricot_delight_price;
					}

					case "rasmalai" -> {
						System.out.println("Rasmalai -> Price is ₹100");
						double rasmalai_price = 100;
						deserts_total += rasmalai_price;
					}

					case "kheer" -> {
						System.out.println("Rice Kheer -> Price is ₹90");
						double kheer_price = 90;
						deserts_total += kheer_price;
					}

					case "double_chocolate_brownie" -> {
						System.out.println("Double Chocolate Brownie -> Price is ₹130");
						double double_chocolate_brownie_price = 130;
						deserts_total += double_chocolate_brownie_price;
					}

					case "ice_cream" -> {
						System.out.println("Vanilla Ice Cream -> Price is ₹70");
						double ice_cream_price = 70;
						deserts_total += ice_cream_price;
					}

					case "kunafa" -> {
						System.out.println("Kunafa -> Price is ₹180");
						double kunafa_price = 180;
						deserts_total += kunafa_price;
					}

					case "rasgulla" -> {
						System.out.println("Rasgulla -> Price is ₹70");
						double rasgulla_price = 70;
						deserts_total += rasgulla_price;
					}

					case "carrot_halwa" -> {
						System.out.println("Carrot Halwa -> Price is ₹100");
						double carrot_halwa_price = 100;
						deserts_total += carrot_halwa_price;
					}
					default -> System.out.println("Entered Desert is Not Available");
					}
					System.out.println("Do You Want to Continue With the Deserts..? Click Y for Yes N for No");
					dsyn = sc.next();
				} while (dsyn.equalsIgnoreCase("y"));
				System.out.println("Deserts Total:" + deserts_total);
				grand_total += deserts_total;
			}
			default -> System.out.println("Entered Catagory is Not Available !!");

			}
			System.out.println("Do you Want to Continue with Catagory : Click Y for Yes N for No ");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Grand Total:" + grand_total);
		System.out.println("**********THANK YOU !! VISIT AGAIN**********");
		sc.close();
	}

}
