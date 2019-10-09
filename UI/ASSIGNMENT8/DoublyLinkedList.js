    // Class for Node
    function Node(data){

        this.data=data;
        this.next=null;
        this.previous=null;
    }
    // Class for LinkedList
    function LinkedList() {
        this.head = null;
        this.tail=null; 
        this.size = 0; 
    }
    LinkedList.prototype.add=function(data) { 
        // creates a new node 
        var node = new Node(data); 
      
        // to store current node 
        var current;
        // if list is Empty add the 
        // element and make it head 
        if (this.head == null){ 
            this.head = node;
            this.tail = node;
        } 
        else { 
            current = this.head; 
      
            // iterate to the end of the 
            // list 
            while (current.next) { 
                current = current.next; 
            } 
            this.tail=node;
            // add node 
            current.next = node;
            node.previous=current; 
        }

        this.size++; 
    } 
    


    
    var obj1=new LinkedList();
    obj1.add(1);
    obj1.add(2);
    obj1.add("Hello");
    //console.log(obj1);
    console.log("\n\nDoubly Linked List From Head");
    var current = obj1.head; 
      
            // iterate to the end of the 
            // list 
            while (current.next) { 
                console.log(current.data);
                current = current.next; 
            }
            console.log(current.data);

    console.log("\n\nDoubly Linked List From Tail");
    var current = obj1.tail; 
      
            // iterate to the end of the 
            // list 
            while (current.previous) { 
                console.log(current.data);
                current = current.previous; 
            }
            console.log(current.data);