# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D visualization tool for ROS."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/rviz"
SECTION = "devel"
LICENSE = "BSD & CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "rviz"

ROS_BUILD_DEPENDS = " \
    assimp \
    cmake-modules \
    geometry-msgs \
    image-transport \
    interactive-markers \
    laser-geometry \
    libeigen \
    libogre-dev \
    libqt5-opengl-dev \
    libtinyxml2 \
    liburdfdom-dev \
    liburdfdom-headers-dev \
    map-msgs \
    mesa \
    message-filters \
    nav-msgs \
    pluginlib \
    python-qt-binding \
    qtbase \
    resource-retriever \
    rosbag \
    rosconsole \
    roscpp \
    roslib \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    urdf \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp \
    geometry-msgs \
    image-transport \
    interactive-markers \
    laser-geometry \
    libogre-dev \
    libtinyxml2 \
    map-msgs \
    mesa \
    message-filters \
    nav-msgs \
    pluginlib \
    python-qt-binding \
    resource-retriever \
    rosbag \
    rosconsole \
    roscpp \
    roslib \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    urdf \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp \
    geometry-msgs \
    image-transport \
    interactive-markers \
    laser-geometry \
    libogre-dev \
    libtinyxml2 \
    map-msgs \
    media-export \
    mesa \
    message-filters \
    nav-msgs \
    pluginlib \
    python-qt-binding \
    qtbase \
    resource-retriever \
    rosbag \
    rosconsole \
    roscpp \
    roslib \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    urdf \
    visualization-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rviz-release/archive/release/melodic/rviz/1.13.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bba583b3d85e430e6017c3efc9d6e465"
SRC_URI[sha256sum] = "1d30b85b375f6c15a25f690e3ac296f19527fd1740e85fa26ba059d5f8fd0bda"
S = "${WORKDIR}/rviz-release-release-melodic-rviz-1.13.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rviz/rviz_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rviz/rviz_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/rviz-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
