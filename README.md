# DSA-assignment
# Problem 10: Busiest Bus Row

## Algorithm

1. Start.
2. Initialize `bestRow = 0` and `bestTotal = -1`.
3. Traverse each row of the 2D grid using an outer loop.
4. Initialize `total = 0` for each row.
5. Traverse each column of the current row using an inner loop and add the number of students in each seat to `total`.
6. If `total` is greater than `bestTotal`, update `bestTotal = total` and `bestRow = i`.
7. If two rows have the same total, keep the row with the smaller index.
8. Return `bestRow`.
9. Display the row index and its total number of students.
10. Stop.

## Example

**Input:**
```text
grid = [[2, 0, 1],
        [3, 3, 1],
        [1, 1, 1]]
```

**Output:**
```text
Row 1, Total 7
```

## Complexity Analysis

- **Time Complexity:** O(r × c), where r is the number of rows and c is the number of columns.
- **Additional Space Complexity:** O(1), because only a constant number of extra variables are used.
