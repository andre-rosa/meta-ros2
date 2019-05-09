# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "ROS communications-related packages, including core client libraries (roscpp, rospy) and graph introspection tools (rostopic, rosnode, rosservice, rosparam)."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Morgan Quigley <mquigley@cs.stanford.edu>"
HOMEPAGE = "http://www.ros.org/wiki/ros_comm"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_comm"
ROS_BPN = "ros_comm"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-filters \
    ros \
    rosbag \
    rosconsole \
    roscpp \
    rosgraph \
    rosgraph-msgs \
    roslaunch \
    roslisp \
    rosmaster \
    rosmsg \
    rosnode \
    rosout \
    rosparam \
    rospy \
    rosservice \
    rostest \
    rostopic \
    roswtf \
    std-srvs \
    topic-tools \
    xmlrpcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-filters \
    ros \
    rosbag \
    rosconsole \
    roscpp \
    rosgraph \
    rosgraph-msgs \
    roslaunch \
    roslisp \
    rosmaster \
    rosmsg \
    rosnode \
    rosout \
    rosparam \
    rospy \
    rosservice \
    rostest \
    rostopic \
    roswtf \
    std-srvs \
    topic-tools \
    xmlrpcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/ros_comm/1.14.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "836f59923b2fdeafa41604ed7380f167"
SRC_URI[sha256sum] = "e50bee6dd4635917c0599d4e97199ac10dbb1e1a8efbb541889076bf10473198"
S = "${WORKDIR}/ros_comm-release-release-melodic-ros_comm-1.14.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('ros-comm', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ros-comm', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-comm/ros-comm_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-comm/ros-comm-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-comm/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-comm/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
