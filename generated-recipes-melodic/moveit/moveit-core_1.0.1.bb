# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Core libraries used by MoveIt!"
AUTHOR = "Dave Coleman <dave@picknik.ai>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_core"

ROS_BUILD_DEPENDS = " \
    assimp \
    boost \
    console-bridge \
    eigen-stl-containers \
    geometric-shapes \
    geometry-msgs \
    kdl-parser \
    libeigen \
    libfcl-dev \
    liburdfdom-dev \
    liburdfdom-headers-dev \
    moveit-msgs \
    octomap \
    octomap-msgs \
    random-numbers \
    rosconsole \
    roslib \
    rostime \
    sensor-msgs \
    shape-msgs \
    srdfdom \
    std-msgs \
    tf2-eigen \
    tf2-geometry-msgs \
    trajectory-msgs \
    urdf \
    visualization-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp \
    boost \
    console-bridge \
    eigen-stl-containers \
    geometric-shapes \
    geometry-msgs \
    kdl-parser \
    libeigen \
    libfcl-dev \
    liburdfdom-dev \
    liburdfdom-headers-dev \
    moveit-msgs \
    octomap \
    octomap-msgs \
    random-numbers \
    rosconsole \
    roslib \
    rostime \
    sensor-msgs \
    shape-msgs \
    srdfdom \
    std-msgs \
    tf2-eigen \
    tf2-geometry-msgs \
    trajectory-msgs \
    urdf \
    visualization-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp \
    boost \
    console-bridge \
    eigen-stl-containers \
    geometric-shapes \
    geometry-msgs \
    kdl-parser \
    libeigen \
    libfcl-dev \
    liburdfdom-dev \
    liburdfdom-headers-dev \
    moveit-msgs \
    octomap \
    octomap-msgs \
    random-numbers \
    rosconsole \
    roslib \
    rostime \
    sensor-msgs \
    shape-msgs \
    srdfdom \
    std-msgs \
    tf2-eigen \
    tf2-geometry-msgs \
    trajectory-msgs \
    urdf \
    visualization-msgs \
    xmlrpcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    angles \
    code-coverage \
    moveit-resources \
    orocos-kdl \
    rosunit \
    tf2-kdl \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_core/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7ce8b0cda64679c05a97a606eb81a665"
SRC_URI[sha256sum] = "bd57f4053319fa6ab6ee556a72bd26dd75d4d653dc01afa39a4da30f16cc7d6d"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_core-1.0.1-0"

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
