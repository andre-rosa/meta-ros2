# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Node launcher and monitor for ROS. rosmon is a replacement 		for the roslaunch tool, focused on performance, remote 		monitoring, and usability."
AUTHOR = "Max Schwarz <max.schwarz@uni-bonn.de>"
ROS_AUTHOR = "Max Schwarz <max.schwarz@uni-bonn.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

ROS_CN = "rosmon"
ROS_BPN = "rosmon_core"

ROS_BUILD_DEPENDS = " \
    boost \
    cmake-modules \
    libncurses-dev \
    libtinyxml \
    python \
    rosbash \
    roscpp \
    rosfmt \
    roslib \
    rosmon-msgs \
    rospack \
    std-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    cmake-modules \
    libncurses-dev \
    libtinyxml \
    rosbash \
    roscpp \
    rosfmt \
    roslib \
    rosmon-msgs \
    rospack \
    std-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    cmake-modules \
    libncurses-dev \
    libtinyxml \
    rosbash \
    roscpp \
    rosfmt \
    roslib \
    rosmon-msgs \
    rospack \
    std-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    catch-ros \
    python-rospkg \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon_core/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9ade9c3c57dd8f00439b446b7d26e2f8"
SRC_URI[sha256sum] = "c9df5410c3df7a9dcb31b219add879887508c4e2208206df6291389a8d4ed682"
S = "${WORKDIR}/rosmon-release-release-melodic-rosmon_core-2.0.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosmon', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rosmon', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosmon/rosmon_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosmon/rosmon-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosmon/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosmon/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
