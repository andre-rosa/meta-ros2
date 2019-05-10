# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "ROS nodes and nodelets for 2-D image perception."
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Manabu Saito"
HOMEPAGE = "http://jsk-docs.readthedocs.io/en/latest/jsk_recognition/doc/jsk_perception"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_recognition"
ROS_BPN = "jsk_perception"

ROS_BUILD_DEPENDS = " \
    angles \
    cmake-modules \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    git \
    image-geometry \
    image-transport \
    image-view2 \
    jsk-data \
    jsk-recognition-msgs \
    jsk-recognition-utils \
    jsk-topic-tools \
    libcmt \
    libeigen \
    message-generation \
    mk \
    nodelet \
    opencv-apps \
    pcl-ros \
    posedetection-msgs \
    robot-self-filter \
    roscpp \
    roseus \
    rospack \
    sensor-msgs \
    std-msgs \
    tf \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    image-geometry \
    image-transport \
    image-view \
    image-view2 \
    imagesift \
    jsk-data \
    jsk-gui-msgs \
    jsk-recognition-msgs \
    jsk-recognition-utils \
    jsk-topic-tools \
    libcmt \
    libeigen \
    message-runtime \
    mk \
    nodelet \
    opencv-apps \
    openni2-launch \
    pcl-ros \
    posedetection-msgs \
    python-chainer-pip \
    python-chainercv-pip \
    python-dlib \
    python-fcn-pip \
    python-h5py \
    python-sklearn \
    robot-self-filter \
    rosbag \
    roscpp \
    roseus \
    rospack \
    rospy \
    rostopic \
    rqt-gui \
    rviz \
    sensor-msgs \
    sound-play \
    std-msgs \
    tf \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    image-geometry \
    image-transport \
    image-view \
    image-view2 \
    imagesift \
    jsk-data \
    jsk-gui-msgs \
    jsk-recognition-msgs \
    jsk-recognition-utils \
    jsk-topic-tools \
    libcmt \
    libeigen \
    message-runtime \
    mk \
    nodelet \
    opencv-apps \
    openni2-launch \
    pcl-ros \
    posedetection-msgs \
    python-chainer-pip \
    python-chainercv-pip \
    python-dlib \
    python-fcn-pip \
    python-h5py \
    python-sklearn \
    robot-self-filter \
    rosbag \
    roscpp \
    roseus \
    rospack \
    rospy \
    rostopic \
    rqt-gui \
    rviz \
    sensor-msgs \
    sound-play \
    std-msgs \
    tf \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    jsk-tools \
    roslaunch \
    roslint \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_perception/1.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "10ef0cc50eb2ceb53d646486e590f8ad"
SRC_URI[sha256sum] = "81431e290cd8a1313d7498f6da53041ec12da6e8b014f4c43215720f67522b63"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-jsk_perception-1.2.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('jsk-recognition', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('jsk-recognition', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-recognition/jsk-recognition_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-recognition/jsk-recognition-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-recognition/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-recognition/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
