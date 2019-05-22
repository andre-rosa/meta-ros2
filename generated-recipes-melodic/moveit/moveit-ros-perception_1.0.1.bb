# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Components of MoveIt! connecting to perception"
AUTHOR = "Michael Ferguson <mferguson@fetchrobotics.com>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_ros_perception"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    freeglut \
    image-transport \
    libeigen \
    libglew-dev \
    mesa \
    message-filters \
    moveit-core \
    moveit-msgs \
    object-recognition-msgs \
    octomap \
    pluginlib \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    freeglut \
    image-transport \
    libglew-dev \
    mesa \
    message-filters \
    moveit-core \
    moveit-msgs \
    object-recognition-msgs \
    octomap \
    pluginlib \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    freeglut \
    image-transport \
    libglew-dev \
    mesa \
    message-filters \
    moveit-core \
    moveit-msgs \
    object-recognition-msgs \
    octomap \
    pluginlib \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_perception/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "afd4d7413a080db3686edaa75aa2eda8"
SRC_URI[sha256sum] = "17224556fc107529db910afacec08cdd3c00af38e518e93c878bdc0d7b0faa5a"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_perception-1.0.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('moveit', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('moveit', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/moveit/moveit_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/moveit/moveit-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/moveit/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/moveit/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
