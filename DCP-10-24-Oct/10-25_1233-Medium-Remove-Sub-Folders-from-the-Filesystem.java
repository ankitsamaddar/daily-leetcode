class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        
        List<String> result = new ArrayList<>();
        
        for (String f : folder) {
            if (result.isEmpty()) {
                result.add(f);
            } else {
                String lastFolder = result.get(result.size() - 1);
                if (!f.startsWith(lastFolder + "/")) {
                    result.add(f);
                }
            }
        }
        
        return result;
    }
}