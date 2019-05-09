# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "rqt_graph provides a GUI plugin for visualizing the ROS       computation graph.<br/>       Its components are made generic so that other packages       where you want to achieve graph representation can depend upon this pkg       (use <a href="http://www.ros.org/wiki/rqt_dep">rqt_dep</a> to find out       the pkgs that depend. rqt_dep itself depends on rqt_graph too)."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Dirk Thomas"
HOMEPAGE = "http://wiki.ros.org/rqt_graph"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_graph"
ROS_BPN = "rqt_graph"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    python-qt-binding \
    qt-dotgraph \
    rosgraph \
    rosgraph-msgs \
    roslib \
    rosnode \
    rospy \
    rosservice \
    rostopic \
    rqt-gui \
    rqt-gui-py \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    qt-dotgraph \
    rosgraph \
    rosgraph-msgs \
    roslib \
    rosnode \
    rospy \
    rosservice \
    rostopic \
    rqt-gui \
    rqt-gui-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rqt_graph-release/archive/release/melodic/rqt_graph/0.4.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "52356e25a50179dcef877b68ead560d8"
SRC_URI[sha256sum] = "42392c916b12e8c40f044840f42090981ae5bdf5925bcaccd716416e2aace427"
S = "${WORKDIR}/rqt_graph-release-release-melodic-rqt_graph-0.4.10-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('rqt-graph', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rqt-graph', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-graph/rqt-graph_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-graph/rqt-graph-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-graph/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-graph/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
