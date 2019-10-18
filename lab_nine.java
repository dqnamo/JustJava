public static int search(LinkedList mylist){

        /* return the highest value held in any of the links, 0 if defective or empty*/



        if (mylist.isEmpty()){

            return 0;

        } else if(mylist.first==null){

            return 0;

        } else {

            int max =0;

            Link current = mylist.first;

            Link test;

            if (mylist.first.data>0){

                max = mylist.first.data;

            }

            while (current.next!=null){



                test =current;

                current = current.next;



                if (current.previous!=test){

                    return 0;

                }



                if (current.data > max){

                    max = current.data;

                }

            }

            return max;

        }

    }
