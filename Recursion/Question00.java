package Recursion;

public class Question00 {
    /* recursion working explained:-

Let’s say you have this function:

void flatten(TreeNode root) {

    flatten(root.right);
    flatten(root.left);
}

Now, when this runs, Java executes in this pattern:

Step A (code before recursion) runs immediately.

When Java hits the recursive call (like flatten(root.right)):

It pauses the current function (flatten(root)) at that line.

It calls a new function (a new copy of flatten, with a different root).

It starts executing inside the new function — from its beginning again.

That new function might call another recursive function inside it — this process repeats.
So, yes, recursion can “go deeper” again and again until it hits a base case (like root == null).

Once the innermost call hits its base case and returns,
Java goes back to the paused function (the previous one on the stack) and continues executing the next line after the recursive call.

After all lines below the recursive calls are also executed,
that function returns, and the stack starts unwinding (functions popping off one by one).

     */
}
