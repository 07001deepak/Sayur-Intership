// 3. No need to write a program. Just pseudocode is enough.Define a class for a instagram post. Define the properties and functions.
// Define which one will be private and which one public.

class InstagramPost {
    // Private properties
    private String username;
    private Image image;


    // Public properties
    public int likes;
    public DateTime timestamp;

    // Constructor (public)
    public InstagramPost(username, image){

        this.username = username;
        this.image = image;
        this.likes = 0;
        this.timestamp = currentDateTime;
    }

    // Public methods
    public void addLike(){

        // Increment the number of likes
        this.likes++;
    }

    public void addComment(comment){

        // Add a comment to the list of comments
        this.comments.add(comment);
      }

    }

    public void deletePost(){
      // Delete the post
    }
        
    public void sharePost(){

        // Share the post to other platforms or users
    }

    public int getLikes(){

        // Get the number of likes
        return this.likes;
    }


