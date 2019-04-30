# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_py_trees provides a GUI plugin for visualizing py_trees behaviour trees based on rqt_tf_tree."
AUTHOR = "Michal Staniaszek <m.staniaszek@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/rqt_py_trees"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=5ee5b8b046ae48ad94a2037ca953a67b"

ROS_BUILD_DEPENDS = " \
    py-trees \
    py-trees-msgs \
    rqt-bag \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    py-trees \
    py-trees-msgs \
    python-pygraphviz \
    python-rospkg \
    python-termcolor \
    qt-dotgraph \
    rospy \
    rqt-bag \
    rqt-graph \
    rqt-gui \
    rqt-gui-py \
    unique-id \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    py-trees \
    py-trees-msgs \
    python-pygraphviz \
    python-rospkg \
    python-termcolor \
    qt-dotgraph \
    rospy \
    rqt-bag \
    rqt-graph \
    rqt-gui \
    rqt-gui-py \
    unique-id \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python-mock \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/stonier/rqt_py_trees-release/archive/release/melodic/rqt_py_trees/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f7f4567b5b2576d08ebbed2098fe29fa"
SRC_URI[sha256sum] = "f01bb9ccb08d23b79f515c9fe65342463911d1af5c2cffec32c33845817b934f"
S = "${WORKDIR}/rqt_py_trees-release-release-melodic-rqt_py_trees-0.3.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rqt-py-trees/rqt-py-trees_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rqt-py-trees/rqt-py-trees_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-py-trees/rqt-py-trees-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-py-trees/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-py-trees/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
