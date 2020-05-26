# test.py
import requests
import schemathesis
import timeit

schema = schemathesis.from_path('./todo.yaml')
schema.base_url = 'http://localhost:8080'

@schema.parametrize()
def test_time(case):
    start = timeit.timeit()
    case.call()
    end = timeit.timeit()
    assert (end-start) < 1
