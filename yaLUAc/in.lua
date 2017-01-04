FUNCTION fact (n)
    IF n == 0 THEN
        RETURN 1
    ELSE
        RETURN n * fact(n-1)
    END
END