class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int numHouses = garbage.length;
int[] prefixTravel = new int[numHouses];

for (int i = 1; i < numHouses; i++) {
    prefixTravel[i] = prefixTravel[i - 1] + travel[i - 1];
}

int metalCount = 0, paperCount = 0, glassCount = 0;
int metalLast = 0, paperLast = 0, glassLast = 0;

for (int i = 0; i < numHouses; i++) {
    String garbageType = garbage[i];

    for (int j = 0; j < garbageType.length(); j++) {
        if (garbageType.charAt(j) == 'M') {
            metalCount++;
            metalLast = i;
        } else if (garbageType.charAt(j) == 'G') {
            glassCount++;
            glassLast = i;
        } else if (garbageType.charAt(j) == 'P') {
            paperCount++;
            paperLast = i;
        }
    }
}

return prefixTravel[paperLast] + prefixTravel[metalLast] + prefixTravel[glassLast] +
       metalCount + paperCount + glassCount;

    }
}
