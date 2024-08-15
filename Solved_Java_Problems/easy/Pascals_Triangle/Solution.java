class Solution {
    public List<List<Integer>> generate(int numRows) {
        //Base Cases
        //If 0, blank
        if (numRows == 0) {
            return new ArrayList<>();
        }
        //If 1, 1
        if (numRows == 1){
            List<List<Integer>> answer = new ArrayList<>();
            answer.add(Arrays.asList(1));
            return answer;
        }
        //Generate the rows prior to this one recursively (Do everything below this until we reach 0 or 1 and return those values in turn.)
        List<List<Integer>> prevRows = generate(numRows-1);
        //Newest Row
        List<Integer> newRows = new ArrayList<>();
        //Populate with 1s to make an array of the right size.
        for (int i = 0; i < numRows; i++){
            newRows.add(1);
        }
        //For each number other than the ones at the start and beginning, access the prev rows to add one to the left and one over together to gives us the pascals number.
        for (int i = 1; i < numRows - 1; i++){
            newRows.set(i, prevRows.get(numRows- 2).get(i-1) + prevRows.get(numRows - 2).get(i));
        }
        prevRows.add(newRows);
        return prevRows;
    }
}