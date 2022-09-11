use std::io;
use std::vec::Vec;

fn pow_int(x: i32, y: u32) -> i32 {
    if y > 0 {
        let mut z = x;
        for _i in 1..y {
            z *= x;
        }
        z
    }
    /*else if y < 0 {
        let w = 1;
        for i in 1..y {
            w /= x;
        }
        w
    }*/
    else {
        1
    }
}

fn main() {
    println!("input your N value:");
    let mut n: String = String::new();
    io::stdin()
        .read_line(&mut n)
        .expect("Failed to read line");
    println!("input your P value:");
    let mut p: String = String::new();
    io::stdin()
        .read_line(&mut p)
        .expect("Failed to read line");

    let mut vecy: Vec<i32> = Vec::new();
    for i in n.chars() {
        match i.to_digit(10) {
            Some(i) => {
                if i > 9 {
                    panic!("Invalid character in number");
                }
                else {
                    vecy.push(i.try_into().unwrap());
                }
            }
            None => {
                println!("no matter really");
            }
        }
    }
    let mut place: i32 = 0;
    for (c, i) in p.chars().enumerate() {
        match i.to_digit(10) {
            Some(i) => {
                if i > 9 {
                    panic!("Invalid character in number");
                }
                else {
                    place += (i * (pow_int(10, c.try_into().unwrap()) as u32)) as i32;
                }
            }
            None => {
                println!("no matter really");
            }
        }
    }
    place = (place - (vecy.len() as i32)) * -1;
    /*if p.parse::<u32>().unwrap() > ((vecy.len() - 1)) as u32 {
        panic!("Problem! Too big P, p needs to be smaller :)");
    }
    let place = (p.parse::<i32>().unwrap() - (vecy.len() as i32)) * -1;*/
    for c in 0..vecy.len() {
        let place_u = place as usize;
        if c > place_u {
            if vecy[c] < vecy[place_u]
            {
                vecy[c] -= vecy[place_u];
                vecy[c] *= -1;
            }
            else {
                vecy[c] -= vecy[place_u];
            }
        }
        else if c < place_u {
            vecy[c] = (vecy[c] + vecy[place_u]) % 10;
        }
    }
    let mut crust = 0;
    let shut = vecy.len() - 1;
    for i in 0..=shut {
        crust += vecy[shut - i] * pow_int(10, i as u32);
    }
    println!("Output: {}", crust);
}
