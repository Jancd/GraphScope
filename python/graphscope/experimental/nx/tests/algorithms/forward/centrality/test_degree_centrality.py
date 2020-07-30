import networkx.algorithms.centrality.tests.test_degree_centrality
import pytest

from graphscope.experimental.nx.utils.compat import import_as_graphscope_nx

import_as_graphscope_nx(networkx.algorithms.centrality.tests.test_degree_centrality,
                        decorators=pytest.mark.usefixtures("graphscope_session"))
